package com.base.java.enum1;


/**
 * 简介: 枚举的使用
 */
public class TestSeason {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter);
        //enum关键字对应的枚举类的上层父类是 ：java.lang.Enum
        //但是我们自定义的枚举类的上层父类：Object
        System.out.println(Season.class.getSuperclass().getName());//java.lang.Enum
    }
}
