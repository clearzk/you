package com.clear.you.design_pattern.bridge;

/**
 * 服装公司
 * @author zk
 * @date 2020/10/12 10:53
 */
public class ClothesCorp extends Corp{

  @Override
  public void product() {
    System.out.println("服装公司生产衣服...");
  }

  @Override
  public void sell() {
    System.out.println("服装公司卖衣服...");
  }

  @Override
  public void makeMoney() {
    super.makeMoney();
    System.out.println("服装公司赚钱了...");
  }
}
