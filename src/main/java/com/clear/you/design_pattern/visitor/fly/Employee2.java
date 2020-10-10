package com.clear.you.design_pattern.visitor.fly;

/**
 * 员工抽象类
 */
public abstract class Employee2 {

    public final static int MALE=0;//男
    public final static int FEMALE=1;//女

    public Employee2(String name, int salary, int sex) {
        this.name = name;
        this.salary = salary;
        this.sex = sex;
    }

    //姓名
    private String name;

    //薪水
    private int salary;

    //性别
    private int sex;

    //允许一个访问者访问
    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
