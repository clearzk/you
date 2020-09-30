package com.clear.you.design_pattern.visitor.fly;



public class Visitor implements IVisitor{
    @Override
    public void visit(CommonEmployee2 commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager2 manager) {
        System.out.println(this.getManagerEmployee(manager));
    }

    //组装出基本信息
    private String getBasicInfo(Employee2 employee) {
        String info="姓名："+employee.getName()+"\t";
        info+="性别："+(employee.getSex()==Employee2.FEMALE?"女":"男")+"\t";
        info+="薪水："+employee.getSalary()+"\t";
        return info;
    }

    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee2 commonEmployee) {
        String basicInfo=this.getBasicInfo(commonEmployee);
        String otherInfo="工作："+commonEmployee.getJob()+"\t";
        return basicInfo+otherInfo;
    }

    //组装出经理的信息
    private String getManagerEmployee(Manager2 manager) {
        String basicInfo=this.getBasicInfo(manager);
        String otherInfo="业绩："+manager.getPerformance()+"\t";
        return basicInfo + otherInfo;
    }


}
