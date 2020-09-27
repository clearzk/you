package com.clear.you.design_pattern.responsibility_chain;

public class Husband extends Handler{

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------女儿向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:同意\n");
        //
    }
}
