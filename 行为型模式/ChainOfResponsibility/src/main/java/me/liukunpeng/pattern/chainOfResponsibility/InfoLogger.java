package me.liukunpeng.pattern.chainOfResponsibility;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO ::Logger: " + message);
    }
}