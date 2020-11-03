package com.clear.you.design_pattern.dns.case1;

/**
 * 全球顶级DNS服务器
 * @author zk
 * @date 2020/10/14 14:41
 */
public class TopDnsServer extends DnsServer{

  @Override
  protected boolean isLocal(String domain) {
    return true;
  }

  @Override
  protected Recorder echo(String domain) {
    Recorder recorder=super.echo(domain);
    recorder.setOwner("全球顶级DNS服务器");
    return recorder;
  }
}
