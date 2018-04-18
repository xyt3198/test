package test.own;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
 
/**
 * @author  xyt
 * 日期：2016-3-1
 */
public class GenEntityFromOracle {
    
    private static String[] colnames; // 列名数组
    private static String[] colcomments; // 列对应注释
    private static String[] colTypes; //列名类型数组
    private static int[] colSizes; //列名大小数组
    private static boolean f_util = false; // 是否需要导入包java.util.*
    private static boolean f_sql = false; // 是否需要导入包java.sql.*
    //private static boolean getSetOriginal = true; //getset方法命名规则是否完全遵循字段名称
    private static int skipUnderNum = 1;
    
    /*只需要配置这4个选项*/
	private static final String db = "orcl";
	private static final String NAME = "iotmain";
	private static final String PASS = "123456";
	private static final String packageName = "com.services.iot.bmc.model";
	private static final String extendsClass = "BaseModel";
	private static final String implementsClass = "Serializable";
	private static final String[] excludeField = new String[]{};
	private static final Map<String, String> aliasMap = new HashMap<String, String>(){/**
         * 
         */
        private static final long serialVersionUID = 2569042396364718982L;
    {
	    put("PK_IRB_SN", "sn");
	    put("IRB_ACCT", "oprAcct");
	}};
	//数据库连接
	private static final String URL ="jdbc:oracle:thin:@192.168.0.222:1521:"+db;
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	
	public static void main(String[] args) throws Exception {
        buildJavaMapper("iot_recharge_bill", "RechargeBill");
    }
 
	public static Map<String, String[]> getTableInfo(String tablename) {
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet result = null;
        try{
            Class.forName(DRIVER);
            System.out.println("开始尝试连接数据库");
            con = DriverManager.getConnection(URL, NAME, PASS);
            System.out.println("连接成功");
            String sql = "select t.table_name,t.column_name,t.data_type,t.data_length,t.nullable,t.column_id,c.comments,(SELECT CASE WHEN t.column_name=m.column_name THEN 1 ELSE 0 END FROM DUAL) iskey FROM user_tab_cols t, user_col_comments c, (select m.column_name from user_constraints s, user_cons_columns m where lower(m.table_name)=? and m.table_name=s.table_name and m.constraint_name=s.constraint_name and s.constraint_type='P') m WHERE lower(t.table_name)=? and c.table_name=t.table_name and c.column_name=t.column_name and t.hidden_column='NO' order by t.column_id";
            pre = con.prepareStatement(sql);
            pre.setString(1, tablename);
            pre.setString(2, tablename);
            result = pre.executeQuery();
            Map<String, String[]> resultMap = new LinkedHashMap<String, String[]>();
            while (result.next()){
                resultMap.put(result.getString("column_name"), new String[]{result.getString("data_type"),result.getString("data_length"),result.getString("nullable"),result.getString("column_id"),result.getString("comments"),result.getString("iskey")});
            }
            return resultMap;
        }catch (Exception e){ e.printStackTrace(); }finally{
            try{
                if (result != null) result.close();
                if (pre != null) pre.close();
                if (con != null) con.close();
                System.out.println("数据库连接已关闭");
            }catch (Exception e){ e.printStackTrace(); }
        }
        return null;
    }
	
    public static void buildJavaMapper(String tableName, String entityName) {
		Map<String, String[]> map = getTableInfo(tableName);
		Iterator<Entry<String, String[]>> iterator = map.entrySet().iterator();
		colnames = new String[map.size()];
		colTypes = new String[map.size()];
		colcomments = new String[map.size()];
		colSizes = new int[map.size()];
		int i=0;
		while(iterator.hasNext()){
			Entry<String, String[]> e = iterator.next();
			colnames[i] = e.getKey();
			colTypes[i] = e.getValue()[0];
			colcomments[i] = "";
			i++;
		}
		String tableComment = "";
        String content = parse(colnames,colTypes,colSizes,tableName,entityName,tableComment);
        
        try {
            File file = new File("d://"+entityName+".java");
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fo = new FileOutputStream(file);
            fo.write(content.getBytes());
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    /**
     * 功能：生成实体类主体代码
     * @param colnames
     * @param colTypes
     * @param colSizes
     * @return
     */
    private static String parse(String[] colnames, String[] colTypes, int[] colSizes, String tablename, String entityName, String tableComment) {
        StringBuffer sb = new StringBuffer();
         
        sb.append("package "+packageName+";\r\n");
        sb.append("\r\n");
        //判断是否导入工具包
        if(f_util){
        	sb.append("import java.util.Date;\r\n");
        }
        if(f_sql){
        	sb.append("import java.sql.*;\r\n");
        }
        if(implementsClass.length()>0){
        	sb.append("import java.io.Serializable;\r\n");
        }
        if(f_util || f_sql || implementsClass != null || !"".equals(implementsClass)){
        	sb.append("\r\n");
        }
        //注释部分
        sb.append("/**\r\n");
        sb.append(" * "+tableComment+" 实体类\r\n");
        //sb.append(" * "+new Date()+"  YuTang Xu\r\n");
        sb.append(" */");
        //实体部分
        sb.append("\r\npublic class " + entityName);
        if(extendsClass.length()>0){
        	sb.append(" extends " + extendsClass);
        }
        if(implementsClass.length()>0){
        	sb.append(" implements " + implementsClass);
        }
        sb.append(" {\r\n");
        sb.append("\r\n");
        processAllAttrs(sb);//属性
        processAllMethod(sb);//get set方法
        sb.append("}");
         
        //System.out.println(sb.toString());
        return sb.toString();
    }
     
    /**
     * 功能：生成所有属性
     * @param sb
     */
    private static void processAllAttrs(StringBuffer sb) {
        f1:for (int i = 0; i < colnames.length; i++) {
        	for(int a = 0;a<excludeField.length;a++){
        		if(colnames[i].equals(excludeField[a])){
        			continue f1;
        		}
        	}
        	sb.append("    /**\r\n");
            sb.append("     * "+colcomments[i]+"\r\n");
            sb.append("     */\r\n");
            sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + getPropName(colnames[i]) + ";\r\n");
            sb.append("\r\n");
            
            if(colnames[i].endsWith("TIME") || colnames[i].endsWith("time")){
                sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " start" + getPropName(colnames[i], true) + ";\r\n");
                sb.append("\r\n");
                
                sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " end" + getPropName(colnames[i], true) + ";\r\n");
                sb.append("\r\n");
            }
        }
    }
 
    /**
     * 功能：生成所有方法
     * @param sb
     */
    private static void processAllMethod(StringBuffer sb) {
        f1:for (int i = 0; i < colnames.length; i++) {
        	for(int a = 0;a<excludeField.length;a++){
        		if(colnames[i].equals(excludeField[a])){
        			continue f1;
        		}
        	}
        	sb.append("    /**\r\n");
            sb.append("     * "+colcomments[i]+"\r\n");
            sb.append("     */\r\n");
            sb.append("\tpublic void set" + getPropName(colnames[i], true) + "(" + sqlType2JavaType(colTypes[i]) + " " + getPropName(colnames[i], false) + ") {\r\n");
            sb.append("\t\tthis." + getPropName(colnames[i], false) + " = " + getPropName(colnames[i], false) + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\r\n");
            sb.append("    /**\r\n");
            sb.append("     * "+colcomments[i]+"\r\n");
            sb.append("     */\r\n");
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + getPropName(colnames[i], true) + "() {\r\n");
            sb.append("\t\treturn " + getPropName(colnames[i], false) + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\r\n");
            
            if(colnames[i].endsWith("TIME") || colnames[i].endsWith("time")){
                sb.append("\tpublic void setStart" + getPropName(colnames[i], true) + "(" + sqlType2JavaType(colTypes[i]) + " start" + getPropName(colnames[i], true) + ") {\r\n");
                sb.append("\t\tthis.start" + getPropName(colnames[i], true) + " = start" + getPropName(colnames[i], true) + ";\r\n");
                sb.append("\t}\r\n");
                sb.append("\r\n");
                sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " getStart" + getPropName(colnames[i], true) + "() {\r\n");
                sb.append("\t\treturn start" + getPropName(colnames[i], true) + ";\r\n");
                sb.append("\t}\r\n");
                sb.append("\r\n");
                
                sb.append("\tpublic void setEnd" + getPropName(colnames[i], true) + "(" + sqlType2JavaType(colTypes[i]) + " end" + getPropName(colnames[i], true) + ") {\r\n");
                sb.append("\t\tthis.end" + getPropName(colnames[i], true) + " = end" + getPropName(colnames[i], true) + ";\r\n");
                sb.append("\t}\r\n");
                sb.append("\r\n");
                sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " getEnd" + getPropName(colnames[i], true) + "() {\r\n");
                sb.append("\t\treturn end" + getPropName(colnames[i], true) + ";\r\n");
                sb.append("\t}\r\n");
                sb.append("\r\n");
            }
        }
    }
     
    /**
     * 功能：将输入字符串的首字母改成大写
     * @param str
     * @return
     */
    @SuppressWarnings("unused")
    private static String initcap(String str, boolean original) {
        char[] ch = str.toCharArray();
        if(original){
        	for(int a = 0;a<ch.length;a++){
            	if(a==0 && ch[a] >= 'a' && ch[a] <= 'z'){
            		ch[a] = (char)(ch[a] - 32);
            	}
            }
            return new String(ch);
        }else{
        	for(int a = 0;a<ch.length;a++){
            	if(a==0 && ch[a] >= 'a' && ch[a] <= 'z'){
            		ch[a] = (char)(ch[a] - 32);
            	}
            	if(ch[a] == (char)95 && ch[a+1] >= 'a' && ch[a+1] <= 'z'){
            		ch[a+1] = (char)(ch[a+1] - 32);
            	}
            }
            return new String(ch).replaceAll("_", "");
        }
    }
 
    /**
     * 功能：获得列的数据类型
     * @param sqlType
     * @return
     */
    private static String sqlType2JavaType(String sqlType) {
        if(sqlType.equalsIgnoreCase("bit")){
            return "boolean";
        }else if(sqlType.equalsIgnoreCase("tinyint")){
            return "byte";
        }else if(sqlType.equalsIgnoreCase("smallint")){
            return "short";
        }else if(sqlType.equalsIgnoreCase("int")){
            return "int";
        }else if(sqlType.equalsIgnoreCase("bigint")){
            return "long";
        }else if(sqlType.equalsIgnoreCase("float")){
            return "float";
        }else if(sqlType.equalsIgnoreCase("decimal") || sqlType.equalsIgnoreCase("numeric") 
                || sqlType.equalsIgnoreCase("real") || sqlType.equalsIgnoreCase("money") 
                || sqlType.equalsIgnoreCase("smallmoney")){
            return "double";
        }else if(sqlType.equalsIgnoreCase("varchar") || sqlType.equalsIgnoreCase("char") 
                || sqlType.equalsIgnoreCase("nvarchar") || sqlType.equalsIgnoreCase("nchar") 
                || sqlType.equalsIgnoreCase("text") || sqlType.equalsIgnoreCase("varchar2")
                || sqlType.equalsIgnoreCase("number")){
            return "String";
        }else if(sqlType.equalsIgnoreCase("datetime") || sqlType.equalsIgnoreCase("timestamp") || sqlType.equalsIgnoreCase("date")){
            return "Date";
        }else if(sqlType.equalsIgnoreCase("image") || sqlType.toLowerCase().contains("blob")){
            return "Object";
        }
        return null;
    }
    
    private static String getPropName(String oldName) {
        return getPropName(oldName, false);
    }
    
    private static String getPropName(String oldName, boolean upperFirst) {
        boolean flag = false;
        Iterator<Entry<String, String>> iterator = aliasMap.entrySet().iterator();
        while(iterator.hasNext()){
            Entry<String, String> e = iterator.next();
            if(e.getKey().equals(oldName)){
                flag = true;
                break;
            }
        }
        if(!flag){
            oldName = oldName.toLowerCase();
            int i = 1;
            while(oldName.indexOf("_") >= 0){
                int index = oldName.indexOf("_");
                if(i<=skipUnderNum){
                    oldName = oldName.substring(index+1);
                }else{
                    oldName = oldName.substring(0, index)+(new StringBuilder()).append(Character.toUpperCase(oldName.charAt(index+1)))+oldName.substring(index+2, oldName.length());
                }
                i++;
            }
        }
        if(upperFirst){
            oldName = (new StringBuilder()).append(Character.toUpperCase(oldName.charAt(0))).append(oldName.substring(1)).toString();
        }
        return oldName;
    }
     
}
