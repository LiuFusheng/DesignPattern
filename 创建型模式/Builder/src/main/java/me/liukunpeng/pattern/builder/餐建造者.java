package me.liukunpeng.pattern.builder;

public class 餐建造者 {

    public 餐 素餐 (){
        餐 meal = new 餐();
        meal.addItem(new 蔬菜汉堡());
        meal.addItem(new 可口可乐());
        return meal;
    }

    public 餐 非素餐 (){
        餐 meal = new 餐();
        meal.addItem(new 鸡肉汉堡());
        meal.addItem(new 百事可乐());
        return meal;
    }
}
