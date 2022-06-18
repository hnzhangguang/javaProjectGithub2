package com.base.java.thread;

/**
 * join方法：当一个线程调用了join方法，这个线程就会先被执行，它执行结束以后才可以去执行其余的线程。
 * 注意：必须先start，再join才有效。
 */
public class TestThread_join extends Thread {
    public TestThread_join(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(this.getName()+"----"+i);
        }
    }
}
class Test{
    //这是main方法，程序的入口
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("main-----"+i);
            if(i == 6){
                //创建子线程：
                TestThread_join tt = new TestThread_join("子线程");
                tt.start();
                tt.join();//“半路杀出个程咬金”
            }
        }
    }
}