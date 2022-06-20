package com.base.java.enum1.枚举类实现接口;

public enum Season implements TestInterface {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;


    /**
     * 简介: 所有的对象调用show方法返回的都一样
     */
    @Override
    public void show() {
        System.out.println("这是Season....");
    }
}