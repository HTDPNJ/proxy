package com.hfut.pojo;

public class Mishu implements Gongneng{
    private Laozong laozong=new Laozong("云云");

    @Override
    public void xiaonub() {
        System.out.println("请问您要找马总吗？");
        laozong.xiaonub();
        System.out.println("访客信息备份");
    }

    @Override
    public void chifan() {
        System.out.println("约定时间");
        laozong.chifan();
        System.out.println("访客细信息备注");
    }
}
