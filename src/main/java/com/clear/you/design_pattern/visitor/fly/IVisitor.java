package com.clear.you.design_pattern.visitor.fly;

/**
 * 访问者接口
 */
public interface IVisitor {

    //首先， 定义我可以访问普通员工
    void visit(CommonEmployee2 commonEmployee);

    //其次， 定义我还可以访问部门经理
    void visit(Manager2 manager);

}
