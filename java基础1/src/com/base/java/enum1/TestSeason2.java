package com.base.java.enum1;


/**
 * ���:  ö�ٵ�ʹ��
 * ����:
 */
public class TestSeason2 {
    //����һ��main�������ǳ������ڣ�
    public static void main(String[] args) {
        //��enum�ؼ��ִ�����Seasonö��������ĸ����ǣ�java.lang.Enum,���÷�������Season����ֱ���ù���ʹ�ã�
        //toString();--->��ȡ���������
        Season autumn = Season.AUTUMN;
        System.out.println(autumn/*.toString()*/);//AUTUMN
        System.out.println("--------------------");
        //values:����ö������������
        Season[] values = Season.values();
        for (Season s : values) {
            System.out.println(s/*.toString()*/);
        }
        System.out.println("--------------------");
        //valueOf��ͨ���������ֻ�ȡ���ö�ٶ���
        //ע�⣺��������ֱ��봫��ȷ�������׳��쳣
        Season autumn1 = Season.valueOf("AUTUMN");
        System.out.println(autumn1);
    }
}