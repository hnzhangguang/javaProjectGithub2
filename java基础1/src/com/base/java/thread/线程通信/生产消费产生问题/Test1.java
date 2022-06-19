package com.base.java.thread.线程通信.生产消费产生问题;

/**
 * 简介: 生产-消费者  测试类
 * 功能:
 *
 *
 */
public class Test1 {

    //这是main方法，程序的入口
    public static void main(String[] args) {
        //共享的商品：
        Product p = new Product();
        //创建生产者和消费者线程：
        ProducerThread pt = new ProducerThread(p);
        CustomerThread ct = new CustomerThread(p);
        pt.start();
        ct.start();
    }


}
