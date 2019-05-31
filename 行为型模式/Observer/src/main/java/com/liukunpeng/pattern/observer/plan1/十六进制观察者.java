package com.liukunpeng.pattern.observer.plan1;

public class 十六进制观察者 extends 观察者Observer {

    public 十六进制观察者(主题 subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("十六进制 String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}