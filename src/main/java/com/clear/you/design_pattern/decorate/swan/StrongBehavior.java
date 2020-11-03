package com.clear.you.design_pattern.decorate.swan;

/**
 * 强化行为
 * @author zk
 * @date 2020/10/14 9:30
 */
public class StrongBehavior extends Decorator{

  public StrongBehavior(Swan swan) {
    super(swan);
  }

  @Override
  public void fly() {
    System.out.println("会飞行了...");
  }
}
