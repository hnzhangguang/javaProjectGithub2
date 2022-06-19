package com.base.java.thread.threadsafe;

/**
 * 简介: 同步代码块
 * 功能: synchronized 关键字
 *
 * 总结1：认识同步监视器（锁子）   -----  synchronized(同步监视器){ }
 * 1)必须是引用数据类型，不能是基本数据类型
 * 2)也可以创建一个专门的同步监视器，没有任何业务含义
 * 3)一般使用共享资源做同步监视器即可
 * 4)在同步代码块中不能改变同步监视器对象的引用
 * 5)尽量不要String和包装类Integer做同步监视器
 * 6)建议使用final修饰同步监视器
 *
 */
public class BuyTicketThread_syn_block implements Runnable {
    int ticketNum = 10;
    @Override
    public void run() {
        //此处有1000行代码
        for (int i = 1; i <= 100 ; i++) {
            synchronized (this){//把具有安全隐患的代码锁住即可，如果锁多了就会效率低 --》this就是这个锁
                if(ticketNum > 0){
                    System.out.println("我在"+Thread.currentThread().getName()+"买到了北京到哈尔滨的第" + ticketNum-- + "张车票");
                }
            }
        }
        //此处有1000行代码
    }
}

/**
 * 简介: 同步代码块演示2
 * 功能: 锁住xxxx.class
 * 同步代码块的执行过程
 * 1)第一个线程来到同步代码块，发现同步监视器open状态，需要close,然后执行其中的代码
 * 2)第一个线程执行过程中，发生了线程切换（阻塞 就绪），第一个线程失去了cpu，但是没有开锁open
 * 3)第二个线程获取了cpu，来到了同步代码块，发现同步监视器close状态，无法执行其中的代码，第二个线程也进入阻塞状态
 * 4)第一个线程再次获取CPU,接着执行后续的代码；同步代码块执行完毕，释放锁open
 * 5)第二个线程也再次获取cpu，来到了同步代码块，发现同步监视器open状态，拿到锁并且上锁，由阻塞状态进入就绪状态，再进入运行状态，重复第一个线程的处理过程（加锁）
 * 强调：同步代码块中能发生CPU的切换吗？能！！！ 但是后续的被执行的线程也无法执行同步代码块（因为锁仍旧close）
 */
 class BuyTicketThread2 extends Thread {
    public BuyTicketThread2(String name){
        super(name);
    }
    //一共10张票：
    static int ticketNum = 10;//多个对象共享10张票
    //每个窗口都是一个线程对象：每个对象执行的代码放入run方法中
    @Override
    public void run() {
        //每个窗口后面有100个人在抢票：
        for (int i = 1; i <= 100 ; i++) {
            synchronized (BuyTicketThread_syn_block.class){//锁必须多个线程用的是同一把锁！！！
                if(ticketNum > 0){//对票数进行判断，票数大于零我们才抢票
                    System.out.println("我在"+this.getName()+"买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
                }
            }
        }
    }
}

