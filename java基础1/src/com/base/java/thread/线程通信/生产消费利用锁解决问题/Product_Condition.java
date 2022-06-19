package com.base.java.thread.�߳�ͨ��.���������������������;

import java.util.concurrent.locks.*;


/**
 * ���: ʹ�� Condition ʵ���̼߳��Э��,
 * ���ʹ��Object��wait()��notify()��ʹ��Condition1��await()��signal()���ַ�ʽʵ���̼߳�Э�����Ӱ�ȫ�͸�Ч
 *
 */
public class Product_Condition {//��Ʒ��
    //Ʒ��
    private String brand;
    //����
    private String name;
    //����һ��Lock����
    Lock lock = new ReentrantLock();
    //��һ�������ߵĵȴ����У�
    Condition produceCondition = lock.newCondition();
    //��һ�������ߵĵȴ����У�
    Condition consumeCondition = lock.newCondition();
    //����һ���ƣ�true:��ɫ  false ��ɫ
    boolean flag = false;//Ĭ�������û����Ʒ ��������������  Ȼ��������������
    //setter,getter������
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //������Ʒ
    public void setProduct(String brand,String name){
        lock.lock();
        try{
            if(flag == true){//���Ǻ�ɫ��֤������Ʒ�������߲���������������������
                try {
                    //wait();
                    //�����������������߽���ȴ�������
                    produceCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //������ɫ�ģ���������
            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            //��������Ϣ��һ����ӡ��
            System.out.println("�����������ˣ�" + this.getBrand() + "---" + this.getName());
            //�������Ժ󣬵Ʊ�ɫ����ɺ�ɫ��
            flag = true;
            //���������߸Ͻ������ѣ�
            //notify();
            consumeCondition.signal();
        }finally {
            lock.unlock();
        }
    }
    //������Ʒ��
    public void getProduct(){
        lock.lock();
        try{
            if(!flag){//flag == falseû����Ʒ���ȴ�������������
                try {
                   // wait();
                    //�����ߵȴ����������߳̽���ȴ����У�
                    consumeCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //����Ʒ�����ѣ�
        System.out.println("�����������ˣ�" + this.getBrand() + "---" + this.getName());
            //�����꣺�Ʊ�ɫ��
            flag = false;
            //֪ͨ������������
            //notify();
            produceCondition.signal();
        }finally {
            lock.unlock();
        }
    }
}