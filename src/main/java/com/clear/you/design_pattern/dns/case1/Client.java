package com.clear.you.design_pattern.dns.case1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author zk
 * @date 2020/10/14 14:45
 */
public class Client {

  /*
    秋风清，秋月明
    落叶聚还散，寒鸦栖复惊。
    相思相见知何日？此时此刻难为情！
    入我相思门，知我相思苦，
    长相思兮长相忆，短相思兮无穷极，
    早知如此绊人心，何如当初莫相识。
   */

  public static void main(String[] args) throws Exception{
    //上海域名服务器
    DnsServer sh = new SHDnsServer();
    //中国顶级域名服务器
    DnsServer china = new ChinaDnsServer();
    //全球顶级域名服务器n
    DnsServer top = new TopDnsServer();
    //定义查询路径
    china.setUpperServer(top);
    sh.setUpperServer(china);
    //解析域名
    System.out.println("=====域名解析模拟器=====");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter your domain...");
    String domain = br.readLine();

    Recorder recorder = sh.resolve(domain);
    System.out.println("----DNS服务器解析结果----");
    System.out.println(recorder);
  }

}
