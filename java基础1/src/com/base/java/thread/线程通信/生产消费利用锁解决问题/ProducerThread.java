package com.base.java.thread.线程通信.生产消费利用锁解决问题;

public class ProducerThread extends Thread{//生产者线程
    //共享商品：
    private Product p;
    public ProducerThread(Product p) {
        this.p = p;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {//生产十个商品 i:生产的次数
            if(i % 2 == 0){
                p.setProduct("费列罗","巧克力");
            }else{
                p.setProduct("哈尔滨","啤酒");
            }
        }
    }
}