package test.own;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
 
/**
 * @author  xyt
 * 日期：2016-3-1
 */
public class GenEntityFromMysql {
    
    private String[] colnames; // 列名数组
    private String[] colcomments; // 列对应注释
    private String[] colTypes; //列名类型数组
    private int[] colSizes; //列名大小数组
    private boolean f_util = false; // 是否需要导入包java.util.*
    private boolean f_sql = false; // 是否需要导入包java.sql.*
    private boolean getSetOriginal = true; //getset方法命名规则是否完全遵循字段名称
    
    /*只需要配置这4个选项*/
	private static final String db = "fs_web_hall";
	private static final String NAME = "root";
	private static final String PASS = "welcome";
	private static final String packageName = "com.cy.entity";
	private static final String extendsClass = "";
	private static final String implementsClass = "Serializable";
	private static final String[] excludeField = new String[]{};
	//数据库连接
	private static final String URL ="jdbc:mysql://localhost:3306/"+db;
	private static final String DRIVER ="com.mysql.jdbc.Driver";
 
    /*
     * 构造函数
     */
    public GenEntityFromMysql() throws Exception{
        //创建连接
        Connection con = DriverManager.getConnection(URL,NAME,PASS);
        Statement pStemt1 = null;
        pStemt1 = con.createStatement();
        ResultSet rs = pStemt1.executeQuery("SHOW TABLE STATUS FROM "+db);
        while(rs.next()){
        	f_util = false;
        	f_sql = false;
        	String temptablename = rs.getString("Name");
        	
        	//单一表生成
        	if(!"project_data_dto".equals(temptablename)){
        		continue;
        	}
        	
        	String tableComment = rs.getString("Comment");
        	
        	Statement pStemt2 = null;
            pStemt2 = con.createStatement();
            ResultSet rs2 = pStemt2.executeQuery("SHOW FULL COLUMNS FROM "+temptablename);
            Map<String,String> m = new HashMap<String,String>();
            while(rs2.next()){
            	String colname = rs2.getString("Field");
            	String colcomment = rs2.getString("Comment");
            	m.put(colname, colcomment);
            }
        	
        	//查要生成实体类的表
            String sql = "select * from " + temptablename;
            try {
                try {
                    Class.forName(DRIVER);
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                PreparedStatement pStemt = null;
                pStemt = con.prepareStatement(sql);
                ResultSetMetaData rsmd = pStemt.getMetaData();
                int size = rsmd.getColumnCount();   //统计列
                colnames = new String[size];
                colcomments = new String[size];
                colTypes = new String[size];
                colSizes = new int[size];
                for (int i = 0; i < size; i++) {
                    colnames[i] = rsmd.getColumnName(i + 1);
                    colcomments[i] = m.get(colnames[i]);
                    colTypes[i] = rsmd.getColumnTypeName(i + 1);
                    
                    if(colTypes[i].equalsIgnoreCase("datetime") || colTypes[i].equalsIgnoreCase("timestamp") || colTypes[i].equalsIgnoreCase("date")){
                        f_util = true;
                    }
                    if(colTypes[i].equalsIgnoreCase("image") || colTypes[i].equalsIgnoreCase("text")){
                        f_sql = true;
                    }
                    colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
                }
                 
                String content = parse(colnames,colTypes,colSizes,temptablename,tableComment);
                 
                try {
                    File directory = new File("");
                    //System.out.println("绝对路径："+directory.getAbsolutePath());
                    //System.out.println("相对路径："+directory.getCanonicalPath());
                     
                    //System.out.println("src/?/"+path.substring(path.lastIndexOf("/test/", path.length())) );
                    File f = new File(directory.getAbsolutePath()+ "/src/"+ packageName.replaceAll("[.]", "/"));
                    if(!f.exists()){
                    	f.mkdirs();
                    }
                    FileWriter fw = new FileWriter(directory.getAbsolutePath()+ "/src/"+ packageName.replaceAll("[.]", "/") + "/" + initcap(temptablename, false) + ".java");
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println(content);
                    pw.flush();
                    pw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                 
            } catch (SQLException e) {
                e.printStackTrace();
            } finally{
//              try {
//                  con.close();
//              } catch (SQLException e) {
//                  e.printStackTrace();
//              }
            }
        }
    }
 
    /**
     * 功能：生成实体类主体代码
     * @param colnames
     * @param colTypes
     * @param colSizes
     * @return
     */
    private String parse(String[] colnames, String[] colTypes, int[] colSizes, String tablename, String tableComment) {
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
        if(f_util || f_sql){
        	sb.append("\r\n");
        }
        //注释部分
        sb.append("/**\r\n");
        sb.append(" * "+tableComment+" 实体类\r\n");
        //sb.append(" * "+new Date()+"  YuTang Xu\r\n");
        sb.append(" */\r\n");
        //实体部分
        sb.append("\r\npublic class " + initcap(tablename, false));
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
    private void processAllAttrs(StringBuffer sb) {
        f1:for (int i = 0; i < colnames.length; i++) {
        	for(int a = 0;a<excludeField.length;a++){
        		if(colnames[i].equals(excludeField[a])){
        			continue f1;
        		}
        	}
        	sb.append("    /**\r\n");
            sb.append("     * "+colcomments[i]+"\r\n");
            sb.append("     */\r\n");
            sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + colnames[i] + ";\r\n");
            sb.append("\r\n");
        }
    }
 
    /**
     * 功能：生成所有方法
     * @param sb
     */
    private void processAllMethod(StringBuffer sb) {
        f1:for (int i = 0; i < colnames.length; i++) {
        	for(int a = 0;a<excludeField.length;a++){
        		if(colnames[i].equals(excludeField[a])){
        			continue f1;
        		}
        	}
        	sb.append("    /**\r\n");
            sb.append("     * "+colcomments[i]+"\r\n");
            sb.append("     */\r\n");
            sb.append("\tpublic void set" + initcap(colnames[i], getSetOriginal) + "(" + sqlType2JavaType(colTypes[i]) + " " + colnames[i] + "){\r\n");
            sb.append("\t\tthis." + colnames[i] + "=" + colnames[i] + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\r\n");
            sb.append("    /**\r\n");
            sb.append("     * "+colcomments[i]+"\r\n");
            sb.append("     */\r\n");
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + initcap(colnames[i], getSetOriginal) + "(){\r\n");
            sb.append("\t\treturn " + colnames[i] + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\r\n");
        }
    }
     
    /**
     * 功能：将输入字符串的首字母改成大写
     * @param str
     * @return
     */
    private String initcap(String str, boolean original) {
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
    private String sqlType2JavaType(String sqlType) {
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
                || sqlType.equalsIgnoreCase("text")){
            return "String";
        }else if(sqlType.equalsIgnoreCase("datetime") || sqlType.equalsIgnoreCase("timestamp") || sqlType.equalsIgnoreCase("date")){
            return "Date";
        }else if(sqlType.equalsIgnoreCase("image") || sqlType.toLowerCase().contains("blob")){
            return "Object";
        }
        return null;
    }
     
    /**
     * 出口
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        new GenEntityFromMysql();
    }
 
}
