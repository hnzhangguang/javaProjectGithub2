package com.base.java.thread.�߳�ͨ��.���������������������;


/**
 * ���: Ҳ����ʹ���źű�ʶ��ʵ��
 *
 * ע�⣺wait������notify����  �Ǳ������ͬ����������ͬ��������в���Ч�� ����Ϊ��ͬ���Ļ����Ͻ����̵߳�ͨ�Ų�����Ч�ģ�
 * ע�⣺sleep��wait������sleep��������״̬û���ͷ�����wait��������״̬����ͬʱ�ͷ�����
 *
 *
 */
public class Product_flag {//��Ʒ��
    //Ʒ��
    private String brand;
    //����
    private String name;
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
    public synchronized void setProduct(String brand,String name){
        if(flag == true){//���Ǻ�ɫ��֤������Ʒ�������߲���������������������
            try {
                wait();
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
        notify();
    }
    //������Ʒ��
    public synchronized void getProduct(){
        if(!flag){//flag == falseû����Ʒ���ȴ�������������
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //����Ʒ�����ѣ�
        System.out.println("�����������ˣ�" + this.getBrand() + "---" + this.getName());
        //�����꣺�Ʊ�ɫ��
        flag = false;
        //֪ͨ������������
        notify();
    }
}