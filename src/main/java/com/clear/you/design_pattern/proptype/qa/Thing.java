package com.clear.you.design_pattern.proptype.qa;

public class Thing implements Cloneable{

    public Thing() {
        System.out.println("构造函数被执行了。。。");
    }

    @Override
    protected Thing clone() {
        Thing thing=null;
        try {
            thing= (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
