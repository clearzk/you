package com.clear.you.design_pattern.strategy.best_practice;

/**
 * 策略枚举
 */
public enum Calculator {

    ADD("+"){
        public int exec(int a,int b) {
            return a+b;
        }
    },
    SUB("-"){
        public int exec(int a,int b) {
            return a-b;
        }
    };

    private String value;

    Calculator(String value) {
        this.value = value;
    }

    //获取枚举成员的值
    public String getValue() {
        return this.value;
    }

    //声明一个抽象函数
    public abstract int exec(int a,int b);


}
