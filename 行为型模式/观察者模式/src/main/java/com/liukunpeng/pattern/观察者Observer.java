package com.liukunpeng.pattern;

public abstract class 观察者Observer {
    protected 主题 subject;
    public abstract void update();
}