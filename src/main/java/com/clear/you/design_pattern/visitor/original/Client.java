package com.clear.you.design_pattern.visitor.original;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        for (Employee employee : mockEmployee() ){
            employee.report();
        }
    }

    //模拟出公司的人员情况， 我们可以想象这个数据是通过持久层传递过来的
    public static List<Employee> mockEmployee() {
        List<Employee> employeeList=new ArrayList<>(3);

        //产生张三这个员工
        CommonEmployee zhangSan=new CommonEmployee("张三",1800,Employee.MALE);
        zhangSan.setJob("编写Java程序， 绝对的蓝领、 苦工加搬运工");
        employeeList.add(zhangSan);
        //产生李四这个员工
        CommonEmployee liSi=new CommonEmployee("李四",1900,Employee.FEMALE);
        liSi.setJob("页面美工， 审美素质太不流行了！");
        employeeList.add(liSi);
        //再产生一个经理
        Manager manager=new Manager("王五",18750,Employee.MALE);
        manager.setPerformance("基本上是负值， 但是我会拍马屁呀");
        employeeList.add(manager);

        return employeeList;
    }

}
