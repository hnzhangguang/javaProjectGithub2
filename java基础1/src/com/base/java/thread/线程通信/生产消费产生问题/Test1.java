package com.base.java.thread.�߳�ͨ��.�������Ѳ�������;

/**
 * ���: ����-������  ������
 * ����:
 *
 *
 */
public class Test1 {

    //����main��������������
    public static void main(String[] args) {
        //�������Ʒ��
        Product p = new Product();
        //���������ߺ��������̣߳�
        ProducerThread pt = new ProducerThread(p);
        CustomerThread ct = new CustomerThread(p);
        pt.start();
        ct.start();
    }


}
