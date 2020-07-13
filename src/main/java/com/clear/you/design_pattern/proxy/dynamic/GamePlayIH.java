package com.clear.you.design_pattern.proxy.dynamic;

import com.clear.you.design_pattern.proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GamePlayIH implements InvocationHandler {

    //被代理的实列
    Object target;

    public GamePlayIH(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(target, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登录");
        }
        return invoke;
    }

    public <T> T getInstance() {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
