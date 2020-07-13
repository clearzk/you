package com.clear.you.design_pattern.builder;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        /*
        生产一个奔驰模型， 要求跑的时候，
        先发动引擎， 然后再挂挡启动， 然后停下来， 不需要喇叭
         */
        BenzModel benzModel=new BenzModel();
        ArrayList<String> sequence=new ArrayList<>(4);
        sequence.add(Constants.ENGINE_BOOM);
        sequence.add(Constants.START);
        sequence.add(Constants.STOP);

        benzModel.setSequence(sequence);
        benzModel.run();

        System.out.println("-------------------");

        // 二个宝马模型， 只要启动、 停止
        BMWModel bmw=new BMWModel();
        sequence.clear();
        sequence.add(Constants.START);
        sequence.add(Constants.STOP);
        bmw.setSequence(sequence);
        bmw.run();



    }
}
