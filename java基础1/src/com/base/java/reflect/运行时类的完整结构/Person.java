package com.base.java.reflect.运行时类的完整结构;

import java.io.*;

//作为一个父类
public class Person implements Serializable {
    //属性
    private int age;
    public String name;
    //方法
    private void eat(){
        System.out.println("Person---eat");
    }
    public void sleep(){
        System.out.println("Person---sleep");
    }
}