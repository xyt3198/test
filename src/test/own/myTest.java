package test.own;

import static java.util.Map.entry;

import java.io.File;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class myTest {

	public void a() throws InterruptedException{
		this.wait(20);
	}
	
	public static void main(String[] args) throws Exception {
		//final List<Integer> a = new ArrayList<Integer>();
		/*URL url = new URL("http://iknowpc.bdimg.com/static/common/pkg/common_z_c104c7b.png");
		File file = new File(url.toURI());
		System.out.println(123);
		System.out.println(file.isFile());*/
		
		/*List<String> list = Arrays.asList("1","2","3");
		String[] array = new String[]{"11","22","33"};
		Stream<String> s = Stream.of("111","222","333");
		s.forEach(System.out::println);*/
		
		String message = "{\"r_code\":\"200\",\"r_msg\":\"登录成功\",\"count\":0,\"data\":\"f596a6e2-8cf6-4ba7-9587-361efc66ced3\"}";
		JSONObject jo = JSON.parseObject(message);
		System.out.println(jo.getString("r_code"));
		
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        
        String a = "sdds{0}111";
        System.out.println(MessageFormat.format(a, "你好"));
        
        System.out.println("[qqq]".replaceAll("\\[qqq\\]", "aaa"));
        
        System.out.println("20170105".compareTo("20170105"));
        
        Map<String, Object> map = Map.ofEntries(entry("1",1),entry("3",3),entry("2",2),entry("5",5));
        System.out.println(JSON.toJSONString(map));
        List<Integer> list = List.of(3, 1, 2, 5);
        System.out.println(JSON.toJSONString(list));
        
        String aa = File.separator+"home"+File.separator+"ftpuser"+File.separator+"upgradePack.bin";
        int index = aa.lastIndexOf(File.separator);
        System.out.println(aa.substring(0, index));
        System.out.println(aa.substring(index+1));
        
        String b = "123/n456";
        System.out.println(b.length());
        
        String c1 = "20180319174900";
        String c2 = "20180319174901";
        System.out.println(c1.compareTo(c2));
        
        checkHasProp("varchar(50)");
        
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println(decimalFormat.format(132575800E6d));
	}
	
	private static void checkHasProp(String content) {
        String regEx = "(?<=\\().*(?=\\))";
        Pattern pat = Pattern.compile(regEx);
        Matcher matcher = pat.matcher(content);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
