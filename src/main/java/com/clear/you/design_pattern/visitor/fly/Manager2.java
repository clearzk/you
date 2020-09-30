package com.clear.you.design_pattern.visitor.fly;


/**
 * 管理阶层
 */
public class Manager2 extends Employee2 {

    //这类人员的职责非常明确：业绩
    private String performance;

    public Manager2(String name, int salary, int sex) {
        super(name, salary, sex);
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
