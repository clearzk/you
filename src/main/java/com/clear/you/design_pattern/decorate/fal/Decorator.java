package com.clear.you.design_pattern.decorate.fal;

import com.clear.you.design_pattern.decorate.SchoolReport;

/**
 * 装饰抽象类
 */
public abstract class Decorator extends SchoolReport {

    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
