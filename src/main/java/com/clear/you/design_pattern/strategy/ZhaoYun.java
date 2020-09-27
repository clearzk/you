package com.clear.you.design_pattern.strategy;

/**
 * 赵云
 */
public class ZhaoYun {

    public static void main(String[] args) {

        //刚到吴国开启第一个锦囊
        Context context;
        System.out.println("---刚刚到吴国的时候拆第一个---");
        context=new Context(new BackDoor());
        context.operator(); //拆开执行

        //刘备乐不思蜀了， 拆第二个了
        System.out.println("---刘备乐不思蜀了， 拆第二个了---");
        context=new Context(new GivenGreenLight());
        context.operator();//执行第二个锦囊
        System.out.println("\n");

        //孙权的小兵追来了， 咋办？ 拆第三个
        System.out.println("---孙权的小兵追来了， 咋办？ 拆第三个---");
        context=new Context(new BlockEnemy());
        context.operator();//孙夫人退兵

    }
}
