package com.base.java.enum1;


/**
 * ���: ö�ٵ�ʹ��
 */
public class TestSeason {
    //����һ��main�������ǳ������ڣ�
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter);
        //enum�ؼ��ֶ�Ӧ��ö������ϲ㸸���� ��java.lang.Enum
        //���������Զ����ö������ϲ㸸�ࣺObject
        System.out.println(Season.class.getSuperclass().getName());//java.lang.Enum
    }
}
