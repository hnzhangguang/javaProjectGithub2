package com.base.java.thread.�߳�ͨ��.���������������������;

public class ProducerThread extends Thread{//�������߳�
    //������Ʒ��
    private Product p;
    public ProducerThread(Product p) {
        this.p = p;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {//����ʮ����Ʒ i:�����Ĵ���
            if(i % 2 == 0){
                p.setProduct("������","�ɿ���");
            }else{
                p.setProduct("������","ơ��");
            }
        }
    }
}