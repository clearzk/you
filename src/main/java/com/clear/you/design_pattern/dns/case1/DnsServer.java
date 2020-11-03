package com.clear.you.design_pattern.dns.case1;

import java.util.Random;

/**
 * 抽象域名服务器
 * @author zk
 * @date 2020/10/14 14:24
 */
public abstract class DnsServer {

  //上级DNS是谁
  private DnsServer upperServer;

  //指向上级DNS
  public void setUpperServer(DnsServer upperServer) {
    this.upperServer = upperServer;
  }

  //解析域名
  public final Recorder resolve(String domain) {
    Recorder recorder=null;

    if (isLocal(domain)) {
      recorder = echo(domain);
    }else{
      recorder=upperServer.echo(domain);
    }
    return recorder;
  }

  //每个DNS都有一个数据处理区（ZONE） ,检查域名是否在本区中
  protected abstract boolean isLocal(String domain);

  //每个DNS都必须实现解析任务
  protected Recorder echo(String domain) {
    Recorder recorder=new Recorder();
    recorder.setIp(genIpAddress());
    recorder.setDomain(domain);
    return recorder;
  }


  //随机产生一个IP地址， 工具类
  private String genIpAddress(){
    Random rand = new Random();
    String address = rand.nextInt(255) + "." + rand.nextInt(255) + "."+rand.nextInt(255)+rand.nextInt(255);
    return address;
  }
}
