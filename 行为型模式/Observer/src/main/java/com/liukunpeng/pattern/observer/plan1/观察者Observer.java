package com.liukunpeng.pattern.observer.plan1;

public abstract class 观察者Observer {
    protected 主题 subject;
    public abstract void update();
}