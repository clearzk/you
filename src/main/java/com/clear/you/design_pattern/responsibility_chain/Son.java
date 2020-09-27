package com.clear.you.design_pattern.responsibility_chain;

public class Son extends Handler{

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------女儿向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}
