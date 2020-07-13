package com.clear.you.design_pattern.proxy.dynamic.finaly;

public class UserImpl implements IUser{

    @Override
    public void sayHi(String str) {
        System.out.println("hi, " + str);
    }
}
