package com.clear.you.design_pattern.bridge;

/**
 * 房地产公司，这是最挣钱的公司
 * @author zk
 * @date 2020/10/12 10:50
 */
public class HouseCorp extends Corp{

  @Override
  public void product() {
    System.out.println("房地产公司盖房子...");
  }

  @Override
  public void sell() {
    System.out.println("房地产公司卖房子...");
  }

  @Override
  public void makeMoney() {
    super.makeMoney();
    System.out.println("房地产公司赚大钱了...");
  }
}
