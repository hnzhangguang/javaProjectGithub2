package com.base.java.thread.�߳�ͨ��.���������������������;

public class Product {//��Ʒ��
    //Ʒ��
    private String brand;
    //����
    private String name;

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
    public synchronized void setProduct(String brand, String name) {
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        //��������Ϣ��һ����ӡ��
        System.out.println("�����������ˣ�" + this.getBrand() + "---" + this.getName());
    }

    //������Ʒ��
    public synchronized void getProduct() {
        System.out.println("�����������ˣ�" + this.getBrand() + "---" + this.getName());
    }
}