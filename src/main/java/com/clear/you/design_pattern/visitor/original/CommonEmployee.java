package com.clear.you.design_pattern.visitor.original;

/**
 * 普通员工
 */
public class CommonEmployee extends Employee{

    private String job;

    public CommonEmployee(String name, int salary, int sex) {
        super(name, salary, sex);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    protected String getOtherInfo() {
        return "工作："+this.job+"\t";
    }

}
