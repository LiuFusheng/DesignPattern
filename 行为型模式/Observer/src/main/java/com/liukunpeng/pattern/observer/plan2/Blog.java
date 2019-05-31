package com.liukunpeng.pattern.observer.plan2;


import java.io.Serializable;

public class Blog implements Serializable {
    private String title;
    private  String context;

    public Blog(String title, String context) {
        this.title = title;
        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}