package com.base.java.thread.threadsafe;

/**
 * ���: ͬ������  synchronized
 *
 *
 * ����:
 * �ܽ�1��
 * ���߳���������Դ����Ҫʵ���̵߳�ͬ������Ҫ���м�������������������ǹ���ģ�������Ψһ�ġ�
 * ���ǵ���һ�㶼�������������͵ġ�
 *
 * Ŀ�ģ�������̰߳�ȫ���⡣
 *
 */
public class BuyTicketThread_syn_method implements Runnable {

    int ticketNum = 10;

    @Override
    public void run() {
        //�˴���1000�д���
        for (int i = 1; i <= 100 ; i++) {
            buyTicket();
        }
        //�˴���1000�д���
    }
    public synchronized void buyTicket(){//��ס����this
        if(ticketNum > 0){
            System.out.println("����"+Thread.currentThread().getName()+"���˱������������ĵ�" + ticketNum-- + "�ų�Ʊ");
        }
    }
}


/**
 * ���: ͬ��  static ��
 * ����:
 *  �ܽ�2������ͬ������
 * 1) ��Ҫ��run()����Ϊͬ������
 * 2) �Ǿ�̬ͬ��������ͬ����������this
 *     ��̬ͬ��������ͬ���������� ����.class �ֽ�����Ϣ����
 * 3) ͬ��������Ч��Ҫ����ͬ������
 *      ԭ��ͬ�������ǽ��̵߳����˷������ⲿ����ͬ������������̵߳����˴������ⲿ������ȴ�Ƿ������ڲ�
 * 4) ͬ������������this��һ����סһ������������ס�����е�ͬ��������ͬ�������ֻ����סʹ�ø�ͬ���������Ĵ���飬��û����סʹ�������������Ĵ����
 *
 *
 */
 class BuyTicketThread_syn extends Thread {
    public BuyTicketThread_syn(String name){
        super(name);
    }
    //һ��10��Ʊ��
    static int ticketNum = 10;//���������10��Ʊ
    //ÿ�����ڶ���һ���̶߳���ÿ������ִ�еĴ������run������
    @Override
    public void run() {
        //ÿ�����ں�����100��������Ʊ��
        for (int i = 1; i <= 100 ; i++) {
            buyTicket();
        }
    }
    public static synchronized void buyTicket(){//��ס��ͬ��������:BuyTicketThread.class
        if(ticketNum > 0){//��Ʊ�������жϣ�Ʊ�����������ǲ���Ʊ
            System.out.println("����"+Thread.currentThread().getName()+"���˴ӱ������������ĵ�" + ticketNum-- + "�ų�Ʊ");
        }
    }
}

