package com.base.java.enum1.实际应用;

public class Test1 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(19);
        p.setName("lili");
        p.setSex(Gender.男);//传入枚举类Gender的对象：-->在入口处对参数进行了限制
        System.out.println(p);
    }
}