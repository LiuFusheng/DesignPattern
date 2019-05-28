package me.liukunpeng.pattern.factory.plan2;

public class 服务器电脑  extends 电脑 {

    private String ram;
    private String hdd;
    private String cpu;

    public 服务器电脑(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}