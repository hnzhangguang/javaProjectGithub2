package com.base.java.reflect.����ʱ��������ṹ;

import java.lang.annotation.Annotation;


/**
 * ���: ��ȡ��Ľӿڣ����ڰ���ע��
 */
public class Test04 {
    public static void main(String[] args) {
        //��ȡ�ֽ�����Ϣ��
        Class cls = Student.class;

        
        //��ȡ����ʱ��Ľӿڣ�
        Class[] interfaces = cls.getInterfaces();
        for(Class c:interfaces){
            System.out.println(c);
        }

        //�õ�����Ľӿڣ�
        //�ȵõ�������ֽ�����Ϣ��
        Class superclass = cls.getSuperclass();

        //�õ��ӿڣ�
        Class[] interfaces1 = superclass.getInterfaces();
        for(Class c:interfaces1){
            System.out.println(c);
        }

        //��ȡ����ʱ�����ڵİ���
        Package aPackage = cls.getPackage();
        System.out.println(aPackage);
        System.out.println(aPackage.getName());


        //��ȡ�������ע�⣺
        Annotation[] annotations = cls.getAnnotations();
        for(Annotation a:annotations){
            System.out.println(a);
        }


    }
}
