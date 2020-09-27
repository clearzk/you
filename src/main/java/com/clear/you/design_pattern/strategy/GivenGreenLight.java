package com.clear.you.design_pattern.strategy;

/**
 * 第二个妙计是找吴国太哭诉， 企图给自己开绿灯
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void operator() {
        System.out.println("求吴国太开绿灯,放行！ ");
    }
}
