package com.liukunpeng.pattern;

import com.liukunpeng.pattern.plan1.*;
import com.liukunpeng.pattern.plan2.被观察者;
import com.liukunpeng.pattern.plan2.被观察者2;
import com.liukunpeng.pattern.plan2.观察者;
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


    @Test
    public  void findBlog(){
        被观察者 blogUser=new 被观察者();
        被观察者2 blogUser2=new 被观察者2();
        观察者 blog=new 观察者();
        blogUser.addObserver(blog);//注册：参数是观察者对象
        blogUser.addObserver(blog);//注册：参数是观察者对象
       // blogUser2.addObserver(blog);//注册：参数是观察者对象
        blogUser.sendBlog("学猫叫","喵喵喵");
        blogUser.sendBlog("学狗叫","汪汪汪");
        blogUser2.sendBlog("22222","@@@@@@@");
    }

}