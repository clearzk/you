package com.clear.you.design_pattern.template;

public abstract class HummerModel {

    protected abstract boolean isAlarm();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public void run() {
        this.start();
        this.engineBoom();
        if(isAlarm()){
            this.alarm();
        }
        this.stop();
    }
}
