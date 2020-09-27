package com.clear.you.design_pattern.strategy;

/**
 * 第三个妙计是在逃跑的时候， 让新娘子孙夫人断后， 谁来砍谁
 */
public class BlockEnemy implements IStrategy{
    @Override
    public void operator() {
        System.out.println("孙夫人断后， 挡住追兵");
    }
}
