package com.base.java.thread;

/**
 * Daemon �����߳�
 *
 * ���ð����߳�  ע�⣺�����ã�������
 */
public class Test_Daemon {

    public static void main(String[] args) {
        //�������������̣߳�
        TestThread tt = new TestThread();
        tt.setDaemon(true);//���ð����߳�  ע�⣺�����ã�������
        tt.start();
        //���߳��л�Ҫ���1-10�����֣�
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("main---"+i);
        }




    }

    static class TestThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 1000 ; i++) {
                System.out.println("���߳�----"+i);
            }
        }
    }


    /**
     * ���: �̵߳�stop������ʹ��
     * ����:
     */
    public void method_stop(){

        // �������̵߳� stop ����
        for (int i = 1; i <= 100 ; i++) {
            if(i == 6){
                Thread.currentThread().stop();//���ڷ�����������ʹ��
            }
            System.out.println(i);
        }

    }


}
