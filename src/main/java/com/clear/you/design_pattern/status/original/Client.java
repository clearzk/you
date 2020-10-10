package com.clear.you.design_pattern.status.original;

/**
 * @author zk
 * @date 2020/10/10 15:57
 */
public class Client {

  public static void main(String[] args) {

      ILift lift=new Lift();
      //电梯的初始状态应该是停止状态
      lift.setState(ILift.STOPPING_STATE);

      //首先是电梯门开启，人进去
      lift.open();
      //然后电梯关门
      lift.close();
      //再然后，电梯运行起来，向上或向下
      lift.run();
      //最后到达目的地，电梯停下来
      lift.stop();

  }

}
