package com.base.java.enum1.ö����ʵ�ֽӿ�;

public enum Season implements TestInterface {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;


    /**
     * ���: ���еĶ������show�������صĶ�һ��
     */
    @Override
    public void show() {
        System.out.println("����Season....");
    }
}