package com.clear.you.design_pattern.responsibility_chain;

import cn.hutool.core.util.RandomUtil;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        //随机挑选几个女性
        ArrayList<IWomen> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int rand=RandomUtil.getRandom().nextInt(1,4);
            System.out.println("产生的随机数为：" + rand);
            list.add(new Women(rand,"我要出去逛"));
        }

        //IWomen women=new Women(3,"我要出去浪");

        Handler father=new Father();
        Handler husband=new Husband();
        Handler son=new Son();

        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        //father.handlerMessage(women);
        for (IWomen women : list) {
            father.handlerMessage(women);
        }

    }
}
