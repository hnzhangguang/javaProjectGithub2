package com.base.java.thread.线程通信.生产消费产生问题;


/**
 * 简介: 产品类
 * 功能:
 */
public class Product {//商品类
    //品牌
    private String brand;
    //名字
    private String name;
    //setter,getter方法；
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}