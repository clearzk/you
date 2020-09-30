package com.clear.you.design_pattern.visitor.original;

/**
 * 管理阶层
 */
public class Manager extends Employee{

    //这类人员的职责非常明确：业绩
    private String performance;

    public Manager(String name, int salary, int sex) {
        super(name, salary, sex);
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }


    @Override
    protected String getOtherInfo() {
        return "业绩："+this.performance+"\t";
    }
}
