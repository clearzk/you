package com.clear.you.design_pattern.proxy.dynamic;

import com.clear.you.design_pattern.proxy.GamePlayer;
import com.clear.you.design_pattern.proxy.GamePlayerProxy;
import com.clear.you.design_pattern.proxy.IGamePlayer;
import org.apache.ibatis.plugin.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        //开始打游戏， 记下时间戳
        System.out.println("开始时间是： 2009-8-25 10:45");
        //获得类的class loader
        ClassLoader classLoader = player.getClass().getClassLoader();
        //登录
        String[] arr=new String[]{"zk","123"};
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, player.getClass().getInterfaces(), handler);
        proxy.login("zhangSan", "password");//开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是： 2009-8-26 03:40");
    }
}
