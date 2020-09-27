package com.clear.you.design_pattern.decorate;

/**
 * 修饰成绩单
 */
public class SugerFouthGradeSchoolReport extends FouthGradeSchoolReport{

    //首先要定义你要美化的方法， 先给老爸说学校最高成绩
    public void reportHighScore(){
        System.out.println("这次考试语文最高是75， 数学是78， 自然是80");
    }
    //在老爸看完毕成绩单后， 我再汇报学校的排名情况
    public void reportSort(){
        System.out.println("我是排名第38名...");
    }

    //由于汇报的内容已经发生变更， 那所以要重写父类
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }

}
