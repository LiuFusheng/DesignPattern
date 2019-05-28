package me.liukunpeng.pattern.factory.plan2;

public class 电脑工厂Factory {
    public static 电脑 getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new 个人电脑(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new 服务器电脑(ram, hdd, cpu);
        }

        return null;
    }
}
