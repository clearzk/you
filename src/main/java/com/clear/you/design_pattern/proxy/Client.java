package com.clear.you.design_pattern.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) {

        IGamePlayer player=new GamePlayer("zk");
        GamePlayerProxy playerProxy=new GamePlayerProxy(player);

        //打游戏开始，记录下游戏开始时间
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
        playerProxy.login("zk","123");
        playerProxy.killBoss();
        playerProxy.upgrade();


    }

}
