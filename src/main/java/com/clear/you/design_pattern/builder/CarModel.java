package com.clear.you.design_pattern.builder;

import java.util.ArrayList;

public abstract class CarModel {

    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    abstract void start();
    abstract void alarm();
    abstract void engineBoom();
    abstract void stop();

    public final void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String s = sequence.get(i);
            switch (s) {
                case Constants.START:
                    this.start();
                    break;
                case Constants.ALARM:
                    this.alarm();
                    break;
                case Constants.ENGINE_BOOM:
                    this.engineBoom();
                    break;
                case Constants.STOP:
                    this.stop();
                    break;
                default:
                    System.out.println("switch default case");
            }
        }
    }


    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
