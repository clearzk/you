package com.clear.you.design_pattern.decorate;

public class Father {

    public static void main(String[] args) {
        //把美化的成绩单拿过来
        SchoolReport report=new SugerFouthGradeSchoolReport();
        //看成绩
        report.report();
        //签名
        report.sign("小三");

    }

}
