package com.clear.you.design_pattern.proptype;

public class Mail implements Cloneable{
    //收件人
    private String receiver;
    //邮件主题
    private String subject;
    //称谓
    private String appellation;
    //内容
    private String context;
    //邮件的尾部， 一般都是加上"XXX版权所有"等信息
    private String tail;

    public Mail(AdvTemplate template) {
        this.context=template.getAdvContext();
        this.subject=template.getAdvSubject();
    }

    @Override
    protected Object clone(){
        Mail mail=null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
