package com.clear.you.design_pattern.decorate.swan;

/**
 * 外形美化
 * @author zk
 * @date 2020/10/14 9:29
 */
public class BeautifyAppearance extends Decorator{

  //要美化谁
  public BeautifyAppearance(Swan swan) {
    super(swan);
  }

  //外表美化处理

  @Override
  public void desAppaearance() {
    System.out.println("外表是纯白色的， 非常惹人喜爱！ ");
  }
}
