package com.base.java.enum1.ʵ��Ӧ��;

public class Test1 {
    //����һ��main�������ǳ������ڣ�
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(19);
        p.setName("lili");
        p.setSex(Gender.��);//����ö����Gender�Ķ���-->����ڴ��Բ�������������
        System.out.println(p);
    }
}