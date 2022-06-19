package com.base.java.thread.threadsafe;



/**
 * ���: ���� �ĳ�������
 *
 *�������������
 * ����
 * >��ͬ���̷ֱ߳�ռ�öԷ���Ҫ��ͬ����Դ�����������ڵȴ��Է������Լ���Ҫ��ͬ����Դ�����γ����̵߳�����
 * >���������󣬲�������쳣�����������ʾ��ֻ�����е��̶߳���������״̬���޷�����
 *
 *
 * ��������� ����ͬ����Դ�Ķ��壬����Ƕ��ͬ��
 *
 */
public class TestDeadLock implements Runnable {
    public int flag = 1;
    static Object o1 = new Object(),o2 = new Object();
        
        
    public void run(){
        System.out.println("flag=" + flag);
        // ��flag==1��סo1
        if (flag == 1) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // ֻҪ��סo2�����
                synchronized (o2) {
                    System.out.println("2");
                }
            }
        }
        // ���flag==0��סo2
        if (flag == 0) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // ֻҪ��סo1�����
                synchronized (o1) {
                    System.out.println("3");
                }
            }
        }
    }
        
        
    public static void main(String[] args) {
        // ʵ��2���߳���
        TestDeadLock td1 = new TestDeadLock();
        TestDeadLock td2 = new TestDeadLock();
        td1.flag = 1;
        td2.flag = 0;
        // ����2���߳�
        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        t1.start();
        t2.start();
    }
}