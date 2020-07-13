package com.clear.you.design_pattern.proxy.dynamic.finaly;

public class Client {
    public static void main(String[] args) {
        IUser user=new UserImpl();
        MyInvocationHandler handler=new MyInvocationHandler(user);

        IUser proxy = handler.getProxy();
        proxy.sayHi("zk");

    }
}
