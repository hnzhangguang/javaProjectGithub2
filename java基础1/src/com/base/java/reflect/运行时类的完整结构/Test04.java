package com.base.java.reflect.运行时类的完整结构;

import java.lang.annotation.Annotation;


/**
 * 简介: 获取类的接口，所在包，注解
 */
public class Test04 {
    public static void main(String[] args) {
        //获取字节码信息：
        Class cls = Student.class;

        
        //获取运行时类的接口：
        Class[] interfaces = cls.getInterfaces();
        for(Class c:interfaces){
            System.out.println(c);
        }

        //得到父类的接口：
        //先得到父类的字节码信息：
        Class superclass = cls.getSuperclass();

        //得到接口：
        Class[] interfaces1 = superclass.getInterfaces();
        for(Class c:interfaces1){
            System.out.println(c);
        }

        //获取运行时类所在的包：
        Package aPackage = cls.getPackage();
        System.out.println(aPackage);
        System.out.println(aPackage.getName());


        //获取运行类的注解：
        Annotation[] annotations = cls.getAnnotations();
        for(Annotation a:annotations){
            System.out.println(a);
        }


    }
}
