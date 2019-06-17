package com.hfut.pojo;

public class Laozong implements Gongneng{
    private String name;

    public Laozong(String name) {
        this.name = name;
    }

    public Laozong() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void xiaonub(){
        System.out.println("指定小目标");
    }

    @Override
    public void chifan() {
        System.out.println("吃饭");
    }
}
