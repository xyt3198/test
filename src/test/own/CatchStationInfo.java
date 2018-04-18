package test.own;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;

import org.apache.commons.lang3.math.NumberUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class CatchStationInfo {

    public static void main(String[] args) {
        String responseHtml = decode(HttpUtils.sendGetByHttpCient(String.format("http://so.railcn.net/TrainStation.asp?Station=%s&site=end&Submit2=%s", encode("深圳北"), encode("车站查询"))));
        Document dom = Jsoup.parse(responseHtml);
        JSONObject resultMap = new JSONObject(true);
        int[] i = new int[] {0, 0};
        dom.body().getElementsByTag("table").last().getElementsByTag("tr").stream().filter(e -> i[0]++>1).map(e -> e.text().split(" ")).forEach(e -> resultMap.put(e[1], JSONArray.parseArray(JSON.toJSONString(e))));
        boolean[] flag = new boolean[] {false};
        resultMap.entrySet().stream().map(e -> decode(HttpUtils.sendGetByHttpCient(String.format("http://so.railcn.net/TrainInfo.asp?TrainNo=%s", e.getKey())))).map(e -> {System.out.println("已抓取："+(++i[1])+"/"+resultMap.size());return Jsoup.parse(e);}).forEach(subDom -> subDom.body().getElementsByTag("table").last().getElementsByTag("tr").stream().map(e -> e.text().split(" ")).filter(e -> e.length > 2 && NumberUtils.isNumber(e[1])).sorted((e1, e2) -> e2[1].compareTo(e1[1])).filter(e -> {if(flag[0]) {flag[0] = false;return true;}if("深圳北".equals(e[2])) {flag[0] = true;}return false;}).forEach(e -> ((JSONArray)resultMap.get(e[0])).add(Arrays.asList(e))));
        System.out.println(JSON.toJSONString(resultMap));
    }
    
    private static String encode(String str) {
        try {
            return URLEncoder.encode(str, "GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }
    
    private static String decode(String str) {
        try {
            return new String(str.getBytes("ISO-8859-1"), "GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }
    
}
