package com.base.java.thread.�߳�ͨ��.�������Ѳ�������;


/**
 * ���: ��������
 *
 *
 */
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
                //�����������ɿ���
                p.setBrand("������");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p.setName("�ɿ���");
            }else{
                //����������ơ��
                p.setBrand("������");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p.setName("ơ��");
            }
            //��������Ϣ��һ����ӡ��
            System.out.println("�����������ˣ�" + p.getBrand() + "---" + p.getName());
        }
    }
}