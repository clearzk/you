package com.clear.you.design_pattern.decorate;

/**
 * 学校成绩单
 */
public abstract class SchoolReport {
    //描述成绩
    public abstract void report();

    //家长签字
    public abstract void sign(String name);
}
