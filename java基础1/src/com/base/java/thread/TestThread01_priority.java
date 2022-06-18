package com.base.java.thread;

/**
 * 设置线程优先级
 */
public class TestThread01_priority extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
class TestThread02 extends Thread{
    @Override
    public void run() {
        for (int i = 20; i <= 30 ; i++) {
            System.out.println(i);
        }
    }
}
class Test_priority{
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //创建两个子线程，让这两个子线程争抢资源：
        TestThread01_priority t1 = new TestThread01_priority();
        t1.setPriority(10);//优先级别高
        t1.start();
        TestThread02 t2 = new TestThread02();
        t2.setPriority(1);//优先级别低
        t2.start();
    }
}