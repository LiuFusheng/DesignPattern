package me.liukunpeng.pattern.abstractFactory;

public class 工厂生成器 {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("形状")){
            return new 形状工厂();
        } else if(choice.equalsIgnoreCase("颜色")){
            return new 颜色工厂();
        }
        return null;
    }
}
