package com.clear.you.design_pattern.decorate.swan;

/**
 * 丑小鸭
 * @author zk
 * @date 2020/10/14 9:24
 */
public class UglyDuckling implements Swan{

  @Override
  public void fly() {
    System.out.println("叫声是克噜——克噜——克噜");
  }

  @Override
  public void cry() {
    System.out.println("丑小鸭比较小，还不能飞行");
  }

  @Override
  public void desAppaearance() {
    System.out.println("外形是脏兮兮的白色， 毛茸茸的大脑袋");
  }
}
