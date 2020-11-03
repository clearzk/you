package com.clear.you.design_pattern.bridge;

/**
 * 抽象公司
 * @author zk
 * @date 2020/10/12 10:44
 */
public abstract class Corp {

  //作为老板，自然最关心的是赚钱啦
  public void makeMoney() {
    //赚钱的套路都一样，先生产，再销售
    this.product();
    this.sell();
  }

  //作为赚钱的根本，总得给别人提供价值，生产点东西吧（实物or服务类产品）
  public abstract void product();

  //实现惊险的一跃
  public abstract void sell();

}
