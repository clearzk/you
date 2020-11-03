package com.clear.you.design_pattern.bridge;

/**
 * iPad山寨公司
 * @author zk
 * @date 2020/10/12 10:59
 */
public class IPadCorp extends Corp{

  @Override
  public void product() {
    System.out.println("生产山寨iPad...");
  }

  @Override
  public void sell() {
    System.out.println("销售山寨iPad...");
  }

  @Override
  public void makeMoney() {
    super.makeMoney();
    System.out.println("我赚钱啊...");
  }
}
