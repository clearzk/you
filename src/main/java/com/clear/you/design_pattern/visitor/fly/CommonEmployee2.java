package com.clear.you.design_pattern.visitor.fly;


/**
 * 普通员工
 */
public class CommonEmployee2 extends Employee2 {

    //最有利用的价值--拼命干活
    private String job;

    public CommonEmployee2(String name, int salary, int sex) {
        super(name, salary, sex);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }



}
