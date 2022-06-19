package com.base.java.thread.线程通信.生产消费产生问题;

/**
 * 简介: 消费者类
 * 功能:
 */
public class CustomerThread extends Thread{//消费者线程
    //共享商品：
    private Product p;
    public CustomerThread(Product p) {
        this.p = p;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {//i:消费次数
            System.out.println("消费者消费了：" + p.getBrand() + "---" + p.getName());
        }
    }
}