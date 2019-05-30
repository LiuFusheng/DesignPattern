package com.liukunpeng.pattern.plan1;

public class 八进制观察者 extends 观察者Observer {

    public 八进制观察者(主题 subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "八进制 String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}