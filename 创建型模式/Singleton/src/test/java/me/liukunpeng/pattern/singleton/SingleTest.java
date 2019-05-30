package me.liukunpeng.pattern.singleton;

import org.junit.Test;

public class SingleTest {

    @Test
    public void showMessage() {
        //不合法的构造函数
        //编译时错误：构造函数 饿汉式() 是不可见的
        //饿汉式 object = new 饿汉式();

        //获取唯一可用的对象
        双检锁_双重校验锁 object1 = 双检锁_双重校验锁.getSingleton();
        懒汉式_线程不安全 object2 = 懒汉式_线程不安全.getInstance();
        懒汉式_线程安全 object3 = 懒汉式_线程安全.getInstance();
        枚举 object4 = 枚举.INSTANCE;
        登记式_静态内部类 object5 = 登记式_静态内部类.getInstance();
        饿汉式 object6 = 饿汉式.getInstance();

        //显示消息
        object1.showMessage();
        object2.showMessage();
        object3.showMessage();
        object4.showMessage();
        object5.showMessage();
        object6.showMessage();
    }
    /**
     * 经验之谈：
     * 一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
     * 只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
     * 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
     * 如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
     */
}