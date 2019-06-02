package me.liukunpeng.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class 餐 {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("项目 : "+item.name());
            System.out.print(", 打包类型:"+item.packing().pack());
            System.out.println(", 价格:"+item.price());
        }
    }
}