package com.base.java.thread;

/**
 * Daemon 伴随线程
 *
 * 设置伴随线程  注意：先设置，再启动
 */
public class Test_Daemon {

    public static void main(String[] args) {
        //创建并启动子线程：
        TestThread tt = new TestThread();
        tt.setDaemon(true);//设置伴随线程  注意：先设置，再启动
        tt.start();
        //主线程中还要输出1-10的数字：
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("main---"+i);
        }




    }

    static class TestThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 1000 ; i++) {
                System.out.println("子线程----"+i);
            }
        }
    }


    /**
     * 简介: 线程的stop方法的使用
     * 功能:
     */
    public void method_stop(){

        // 下面是线程的 stop 方法
        for (int i = 1; i <= 100 ; i++) {
            if(i == 6){
                Thread.currentThread().stop();//过期方法，不建议使用
            }
            System.out.println(i);
        }

    }


}
