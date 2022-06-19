package com.base.java.thread.threadsafe;

import java.util.concurrent.locks.*;


/**
 * ���: Lock�����룺
 * JDK1.5��������һ�����߳�ͬ����ʽ:Lock��
 * �����synchronized��ȣ�lock���ṩ�����������������
 *
 * synchronized��Java�еĹؼ��֣�����ؼ��ֵ�ʶ���ǿ�JVM��ʶ����ɵ�ѽ�������������ġ�
 * ����Lock����API����ģ��ṩ����Ӧ�ĽӿںͶ�Ӧ��ʵ���࣬�����ʽ�������ֳ�������������֮ǰ�ķ�ʽ��
 *
 */
public class BuyTicketThread_lock implements Runnable {

    int ticketNum = 10;

    //����һ������
    Lock lock = new ReentrantLock();//��̬  �ӿ�=ʵ����  ����ʹ�ò�ͬ��ʵ����

    @Override
    public void run() {
        //�˴���1000�д���
        for (int i = 1; i <= 100 ; i++) {
            //������
            lock.lock();
            try{
                if(ticketNum > 0){
                    System.out.println("����"+Thread.currentThread().getName()+"���˱������������ĵ�" + ticketNum-- + "�ų�Ʊ");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }finally {
                //�ر�����--->��ʹ���쳣�������Ҳ���Եõ��ͷ�
                lock.unlock();
            }
        }
        //�˴���1000�д���
    }
}


/**
 * ���:
 * Lock��synchronized������
 *
 *         1.Lock����ʽ�����ֶ������͹ر����������ǹر�������synchronized����ʽ��
 *         2.Lockֻ�д��������synchronized�д�������ͷ�����
 *         3.ʹ��Lock����JVM�����ѽ��ٵ�ʱ���������̣߳����ܸ��á����Ҿ��и��õ���չ�ԣ��ṩ��������ࣩ
 *
 *
 *
 */




