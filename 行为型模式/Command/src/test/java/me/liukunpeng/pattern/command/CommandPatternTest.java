package me.liukunpeng.pattern.command;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandPatternTest {

    @Test
    public void ma() {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}