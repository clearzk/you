package com.clear.you.ip;

import javax.servlet.http.HttpServletRequest;

public class IpUtils {

    public static final String LOCALHOST_IP_STR = "127.0.0.1";

    /**
     * 获取客户端ip
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
        final String unknownStr = "unknown";
        if (request == null) {
            return unknownStr;
        }
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || unknownStr.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || unknownStr.equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Forwarded-For");
        }
        if (ip == null || ip.length() == 0 || unknownStr.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || unknownStr.equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }

        if (ip == null || ip.length() == 0 || unknownStr.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        return "0:0:0:0:0:0:0:1".equals(ip) ? LOCALHOST_IP_STR : ip;
    }

}
