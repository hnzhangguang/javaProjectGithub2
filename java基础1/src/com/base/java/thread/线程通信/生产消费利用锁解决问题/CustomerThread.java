package com.base.java.thread.�߳�ͨ��.���������������������;

public class CustomerThread extends Thread{//�������߳�
    //������Ʒ��
    private Product p;
    public CustomerThread(Product p) {
        this.p = p;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {//i:���Ѵ���
            p.getProduct();;
        }
    }
}
