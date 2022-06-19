package com.base.java.thread.threadsafe;

import java.util.concurrent.locks.*;


/**
 * 简介: Lock锁引入：
 * JDK1.5后新增新一代的线程同步方式:Lock锁
 * 与采用synchronized相比，lock可提供多种锁方案，更灵活
 *
 * synchronized是Java中的关键字，这个关键字的识别是靠JVM来识别完成的呀。是虚拟机级别的。
 * 但是Lock锁是API级别的，提供了相应的接口和对应的实现类，这个方式更灵活，表现出来的性能优于之前的方式。
 *
 */
public class BuyTicketThread_lock implements Runnable {

    int ticketNum = 10;

    //拿来一把锁：
    Lock lock = new ReentrantLock();//多态  接口=实现类  可以使用不同的实现类

    @Override
    public void run() {
        //此处有1000行代码
        for (int i = 1; i <= 100 ; i++) {
            //打开锁：
            lock.lock();
            try{
                if(ticketNum > 0){
                    System.out.println("我在"+Thread.currentThread().getName()+"买到了北京到哈尔滨的第" + ticketNum-- + "张车票");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }finally {
                //关闭锁：--->即使有异常，这个锁也可以得到释放
                lock.unlock();
            }
        }
        //此处有1000行代码
    }
}


/**
 * 简介:
 * Lock和synchronized的区别
 *
 *         1.Lock是显式锁（手动开启和关闭锁，别忘记关闭锁），synchronized是隐式锁
 *         2.Lock只有代码块锁，synchronized有代码块锁和方法锁
 *         3.使用Lock锁，JVM将花费较少的时间来调度线程，性能更好。并且具有更好的扩展性（提供更多的子类）
 *
 *
 *
 */




