package com.base.java.thread.线程通信.生产消费利用锁解决问题;

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

    //生产商品
    public synchronized void setProduct(String brand, String name) {
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        //将生产信息做一个打印：
        System.out.println("生产者生产了：" + this.getBrand() + "---" + this.getName());
    }

    //消费商品：
    public synchronized void getProduct() {
        System.out.println("消费者消费了：" + this.getBrand() + "---" + this.getName());
    }
}