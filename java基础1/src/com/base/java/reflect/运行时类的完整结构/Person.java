package com.base.java.reflect.����ʱ��������ṹ;

import java.io.*;

//��Ϊһ������
public class Person implements Serializable {
    //����
    private int age;
    public String name;
    //����
    private void eat(){
        System.out.println("Person---eat");
    }
    public void sleep(){
        System.out.println("Person---sleep");
    }
}