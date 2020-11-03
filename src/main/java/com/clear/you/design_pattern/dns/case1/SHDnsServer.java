package com.clear.you.design_pattern.dns.case1;

/**
 * 上海DNS服务器
 * @author zk
 * @date 2020/10/14 14:34
 */
public class SHDnsServer extends DnsServer{

  @Override
  protected boolean isLocal(String domain) {
    return domain.endsWith(".sh.cn");
  }

  @Override
  protected Recorder echo(String domain) {
    Recorder recorder=super.echo(domain);
    recorder.setOwner("上海DNS服务器");
    return recorder;
  }
}
