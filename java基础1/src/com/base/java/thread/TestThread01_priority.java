package com.base.java.thread;

/**
 * �����߳����ȼ�
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
    //����main��������������
    public static void main(String[] args) {
        //�����������̣߳������������߳�������Դ��
        TestThread01_priority t1 = new TestThread01_priority();
        t1.setPriority(10);//���ȼ����
        t1.start();
        TestThread02 t2 = new TestThread02();
        t2.setPriority(1);//���ȼ����
        t2.start();
    }
}