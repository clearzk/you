package com.clear.you.design_pattern.status.original;

/**
 * 电梯接口
 * @author zk
 * @date 2020/10/10 15:46
 */
public interface ILift {

    final static int OPENING_STATE=1;//敞门状态
    final static int CLOSING_STATE=2;//闭门状态
    final static int RUNNING_STATE=3;//运行状态
    final static int STOPPING_STATE=4;//停止状态

    //设置电梯的状态
    void setState(int state);

    //开门
    void open();

    //关门
    void close();

    //运行
    void run();

    //停止
    void stop();

}
