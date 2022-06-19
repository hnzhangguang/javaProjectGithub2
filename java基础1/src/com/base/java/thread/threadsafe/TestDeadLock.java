package com.base.java.thread.threadsafe;



/**
 * 简介: 死锁 的呈现例子
 *
 *可能造成死锁：
 * 死锁
 * >不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，就形成了线程的死锁
 * >出现死锁后，不会出现异常，不会出现提示，只是所有的线程都处于阻塞状态，无法继续
 *
 *
 * 解决方法： 减少同步资源的定义，避免嵌套同步
 *
 */
public class TestDeadLock implements Runnable {
    public int flag = 1;
    static Object o1 = new Object(),o2 = new Object();
        
        
    public void run(){
        System.out.println("flag=" + flag);
        // 当flag==1锁住o1
        if (flag == 1) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 只要锁住o2就完成
                synchronized (o2) {
                    System.out.println("2");
                }
            }
        }
        // 如果flag==0锁住o2
        if (flag == 0) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 只要锁住o1就完成
                synchronized (o1) {
                    System.out.println("3");
                }
            }
        }
    }
        
        
    public static void main(String[] args) {
        // 实例2个线程类
        TestDeadLock td1 = new TestDeadLock();
        TestDeadLock td2 = new TestDeadLock();
        td1.flag = 1;
        td2.flag = 0;
        // 开启2个线程
        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        t1.start();
        t2.start();
    }
}