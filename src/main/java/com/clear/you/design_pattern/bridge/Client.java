package com.clear.you.design_pattern.bridge;

/**
 * @author zk
 * @date 2020/10/12 10:55
 */
public class Client {

  public static void main(String[] args) {

    System.out.println("--------------房地产公司是这样运行的------------------");
    //先找到我的公司
    HouseCorp houseCorp=new HouseCorp();
    //再看我怎么挣钱
    houseCorp.makeMoney();

    System.out.println("--------------服装公司是这样运行的------------------");
    ClothesCorp clothesCorp=new ClothesCorp();
    clothesCorp.makeMoney();

    System.out.println("--------------山寨iPad公司是这样运行的------------------");
    IPadCorp iPadCorp=new IPadCorp();
    iPadCorp.makeMoney();

  }

}
