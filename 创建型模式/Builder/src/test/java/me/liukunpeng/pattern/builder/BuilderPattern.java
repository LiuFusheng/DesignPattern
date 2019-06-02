package me.liukunpeng.pattern.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderPattern {

    @Test
    public void in() {
        餐建造者 mealBuilder = new 餐建造者();

        餐 vegMeal = mealBuilder.素餐();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        餐 nonVegMeal = mealBuilder.非素餐();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}