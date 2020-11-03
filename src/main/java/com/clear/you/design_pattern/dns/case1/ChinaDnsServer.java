package com.clear.you.design_pattern.dns.case1;

/**
 * 中国DNS服务器
 * @author zk
 * @date 2020/10/14 14:39
 */
public class ChinaDnsServer extends DnsServer{

  @Override
  protected boolean isLocal(String domain) {
    return domain.endsWith(".cn");
  }

  @Override
  protected Recorder echo(String domain) {
    Recorder recorder=super.echo(domain);
    recorder.setOwner("中国DNS服务器");
    return recorder;
  }
}
