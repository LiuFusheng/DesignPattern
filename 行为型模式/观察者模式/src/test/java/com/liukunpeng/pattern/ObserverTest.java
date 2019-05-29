package com.liukunpeng.pattern;

import org.junit.Test;

public class ObserverTest {

    @Test
    public void update(){
        主题 subject = 主题.getInstance();

        new 十六进制观察者(subject);
        new 八进制观察者(subject);
        new 字节码观察者(subject);

        主题 subject1 = 主题.getInstance();
        new LKPObserver(subject1);

       // System.out.println("First state change: 15");
       // subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
        System.out.println("------------------");
        subject1.setState(15);
    }

}