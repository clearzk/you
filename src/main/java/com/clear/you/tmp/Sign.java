package com.clear.you.tmp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sign {

    public static void main(String[] args) {
        String appId = "frls51ik0p";
        String userId = "XXXXXXXX";
        String appSecret = "12eca91f1d554ebf8673d7d0e37f0a1c";

//        long ts = 1601278395139l;
        long ts = System.currentTimeMillis();
        // 创建参数表 （创建接口需要传递的所有参数表）
        Map<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("appId", appId);
        paramMap.put("timestamp", Long.toString(ts));

        //对参数名进行字典排序
        String[] keyArray = paramMap.keySet().toArray(new String[0]);
        Arrays.sort(keyArray);

        //拼接有序的参数串
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(appSecret);
        for (String key : keyArray) {
            stringBuilder.append(key).append(paramMap.get(key));
        }

        stringBuilder.append(appSecret);
        String signSource = stringBuilder.toString();

        String sign = org.apache.commons.codec.digest.DigestUtils.md5Hex(signSource).toUpperCase();
        System.out.println("http://api.polyv.net/live/v1/users/" + userId + "/channels?appId=" + appId + "&timestamp=" + ts + "&sign=" + sign);

    }

    /*private static void testBasic() {
        String url = "http://api.polyv.net/live/v3/channel/basic/get";
        // 用户对应的appId和加密串
        String appId = "xxxxxxx";
        String appSecret = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        // 查询频道号
        String channelId = "415174";

        Map<String, String> params = new HashMap<>();
        params.put("channelId", channelId);
        // 调用Polyv的工具类方法设置sign
        PolyvTool.setLiveSign(params, appId, appSecret);
        // 调用Polyv的httpClient工具类发送请求
        String content = HttpClientUtil.getInstance()
                .sendHttpGet(url + "?" + PolyvTool.mapJoinNotEncode(params));
        System.out.println(content);
    }*/


}
