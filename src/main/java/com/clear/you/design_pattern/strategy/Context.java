package com.clear.you.design_pattern.strategy;

/**
 * 妙计存放在锦囊中
 */
public class Context {

    private IStrategy strategy;

    //构造函数， 你要使用哪个妙计
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋了， 看我出招
    public void operator() {
        this.strategy.operator();
    }
}
