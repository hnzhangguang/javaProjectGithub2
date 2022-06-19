package com.base.java.thread.threadsafe;

/**
 * 简介: 同步方法  synchronized
 *
 *
 * 功能:
 * 总结1：
 * 多线程在争抢资源，就要实现线程的同步（就要进行加锁，并且这个锁必须是共享的，必须是唯一的。
 * 咱们的锁一般都是引用数据类型的。
 *
 * 目的：解决了线程安全问题。
 *
 */
public class BuyTicketThread_syn_method implements Runnable {

    int ticketNum = 10;

    @Override
    public void run() {
        //此处有1000行代码
        for (int i = 1; i <= 100 ; i++) {
            buyTicket();
        }
        //此处有1000行代码
    }
    public synchronized void buyTicket(){//锁住的是this
        if(ticketNum > 0){
            System.out.println("我在"+Thread.currentThread().getName()+"买到了北京到哈尔滨的第" + ticketNum-- + "张车票");
        }
    }
}


/**
 * 简介: 同步  static 块
 * 功能:
 *  总结2：关于同步方法
 * 1) 不要将run()定义为同步方法
 * 2) 非静态同步方法的同步监视器是this
 *     静态同步方法的同步监视器是 类名.class 字节码信息对象
 * 3) 同步代码块的效率要高于同步方法
 *      原因：同步方法是将线程挡在了方法的外部，而同步代码块锁将线程挡在了代码块的外部，但是却是方法的内部
 * 4) 同步方法的锁是this，一旦锁住一个方法，就锁住了所有的同步方法；同步代码块只是锁住使用该同步监视器的代码块，而没有锁住使用其他监视器的代码块
 *
 *
 */
 class BuyTicketThread_syn extends Thread {
    public BuyTicketThread_syn(String name){
        super(name);
    }
    //一共10张票：
    static int ticketNum = 10;//多个对象共享10张票
    //每个窗口都是一个线程对象：每个对象执行的代码放入run方法中
    @Override
    public void run() {
        //每个窗口后面有100个人在抢票：
        for (int i = 1; i <= 100 ; i++) {
            buyTicket();
        }
    }
    public static synchronized void buyTicket(){//锁住的同步监视器:BuyTicketThread.class
        if(ticketNum > 0){//对票数进行判断，票数大于零我们才抢票
            System.out.println("我在"+Thread.currentThread().getName()+"买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
        }
    }
}

