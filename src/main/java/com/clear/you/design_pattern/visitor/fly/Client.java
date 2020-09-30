package com.clear.you.design_pattern.visitor.fly;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        for (Employee2 employee : mockEmployee()) {
            employee.accept(new Visitor());
        }
    }

    //模拟出公司的人员情况， 我们可以想象这个数据是通过持久层传递过来的
    public static List<Employee2> mockEmployee() {
        List<Employee2> employeeList=new ArrayList<>(3);
        //产生张三
        CommonEmployee2 zhangSan=new CommonEmployee2("张三",1800,Employee2.MALE);
        zhangSan.setJob("编写Java程序， 绝对的蓝领、 苦工加搬运工");
        employeeList.add(zhangSan);
        //产生李四
        CommonEmployee2 liSi=new CommonEmployee2("李四",1900,Employee2.FEMALE);
        liSi.setJob("页面美工， 审美素质太不流行了！");
        employeeList.add(liSi);
        //产生王五
        Manager2 wangWu=new Manager2("王五",18750,Employee2.MALE);
        wangWu.setPerformance("基本上是负值， 但是我会拍马屁呀");
        employeeList.add(wangWu);
        return employeeList;
    }

}
