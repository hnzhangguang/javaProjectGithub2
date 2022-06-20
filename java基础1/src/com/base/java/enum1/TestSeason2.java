package com.base.java.enum1;


/**
 * 简介:  枚举的使用
 * 功能:
 */
public class TestSeason2 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //用enum关键字创建的Season枚举类上面的父类是：java.lang.Enum,常用方法子类Season可以直接拿过来使用：
        //toString();--->获取对象的名字
        Season autumn = Season.AUTUMN;
        System.out.println(autumn/*.toString()*/);//AUTUMN
        System.out.println("--------------------");
        //values:返回枚举类对象的数组
        Season[] values = Season.values();
        for (Season s : values) {
            System.out.println(s/*.toString()*/);
        }
        System.out.println("--------------------");
        //valueOf：通过对象名字获取这个枚举对象
        //注意：对象的名字必须传正确，否则抛出异常
        Season autumn1 = Season.valueOf("AUTUMN");
        System.out.println(autumn1);
    }
}