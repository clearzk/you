package com.clear.you.design_pattern.decorate.swan;

/**
 * 装饰类
 * @author zk
 * @date 2020/10/14 9:26
 */
public class Decorator implements Swan{

  private Swan swan;

  public Decorator(Swan swan) {
    this.swan = swan;
  }


  @Override
  public void fly() {
    swan.fly();
  }

  @Override
  public void cry() {
    swan.cry();
  }

  @Override
  public void desAppaearance() {
    swan.desAppaearance();
  }
}
