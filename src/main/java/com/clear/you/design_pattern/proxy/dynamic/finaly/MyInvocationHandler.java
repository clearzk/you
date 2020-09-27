package com.clear.you.design_pattern.proxy.dynamic.finaly;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    //被代理对象
    Object target;

    public MyInvocationHandler(Object target) {
        //校验是否是接口，因为jdk动态代理只支持接口代理
        checkInterface(target);
        this.target = target;
    }

    private void checkInterface(Object target) {
        Class<?>[] cls = target.getClass().getInterfaces();
        boolean isInterface = cls[0].isInterface();
        System.out.println(target.getClass().getName());
        if(!isInterface){
            throw new RuntimeException("JDK动态代理不支持非接口的代理");
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke method");
        Object result = method.invoke(target, args);
        System.out.println("after invoke method");
        return result;
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
