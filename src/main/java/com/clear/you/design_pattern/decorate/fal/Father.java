package com.clear.you.design_pattern.decorate.fal;

import com.clear.you.design_pattern.decorate.FouthGradeSchoolReport;
import com.clear.you.design_pattern.decorate.SchoolReport;

public class Father {

    public static void main(String[] args) {
        SchoolReport sr;
        //原装的成绩单
        sr=new FouthGradeSchoolReport();

        //加了排名的成绩单
        sr=new SortDecorator(sr);

        //加了最高分说明的成绩单
        sr=new HighScoreDecorator(sr);

        //汇报成绩
        sr.report();
        //签名
        sr.sign("小三");
    }
}
