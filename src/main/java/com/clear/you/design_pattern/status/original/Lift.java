package com.clear.you.design_pattern.status.original;

/**
 * 电梯实现类
 * @author zk
 * @date 2020/10/10 15:50
 */
public class Lift implements ILift{

  private int state;

  @Override
  public void setState(int state) {
    this.state=state;
  }

  /**
   * 电梯门开启
   */
  @Override
  public void open() {
    //电梯在什么状态下，才能开门
    switch (this.state){
      case OPENING_STATE:
        //do nothing
        break;
      case CLOSING_STATE://闭门状态，可以开门
        this.openWithoutLogic();
        this.setState(OPENING_STATE);
        break;
      case RUNNING_STATE://运行状态，不能开门，什么都不做
        //do nothing
        break;
      case STOPPING_STATE://停止状态，当然要开门了
        this.openWithoutLogic();
        this.setState(OPENING_STATE);
        break;
    }

  }

  @Override
  public void close() {
      //电梯在什么状态下，才能关门
    switch (this.state) {
      case OPENING_STATE://门开着，当然可以关闭呀
        this.closeWithoutLogic();
        this.setState(CLOSING_STATE);
        break;
      case CLOSING_STATE://已经处于关闭状态，则什么都不做
        //do nothing
        break;
      case RUNNING_STATE://正在运行中，门本来就是关的
        break;
      case STOPPING_STATE://停止运行了，门也是关的，什么都不做
        break;
    }
  }

  @Override
  public void run() {
      //什么状态下，开始运行
    switch (this.state) {
      case OPENING_STATE://们还是开的，不安全，不能运行
        break;
      case CLOSING_STATE:
        this.runWithoutLogic();
        this.setState(RUNNING_STATE);
        break;
      case RUNNING_STATE://已经在运行了，什么也不做
        break;
      case STOPPING_STATE://
        this.runWithoutLogic();
        this.setState(RUNNING_STATE);
        break;
    }
  }

  @Override
  public void stop() {
    //什么状态下，可以停止
    switch (this.state) {
      case OPENING_STATE:
        break;
      case CLOSING_STATE:
        this.stopWithoutLogic();
        this.setState(STOPPING_STATE);
        break;
      case RUNNING_STATE:
        this.stopWithoutLogic();
        this.setState(STOPPING_STATE);
        break;
      case STOPPING_STATE:
        break;
    }
  }

  /**
   * 纯粹的电梯开门，不考虑实际逻辑
   */
  public void openWithoutLogic() {
    System.out.println("电梯开门...");
  }

  /**
   * 纯粹的电梯关门，不考虑实际逻辑
   */
  public void closeWithoutLogic() {
    System.out.println("电梯关门...");
  }

  /**
   * 纯粹的电梯运行，不考虑实际逻辑
   */
  public void runWithoutLogic() {
    System.out.println("电梯运行中...");
  }

  /**
   * 纯粹的电梯停止，不考虑实际逻辑
   */
  public void stopWithoutLogic() {
    System.out.println("电梯停止了...");
  }
}
