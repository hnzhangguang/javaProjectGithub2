package com.base.java.enum1.实际应用;


/**
 * 简介: 通过枚举结合switch处理
 */
public class Test02 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        Gender sex = Gender.男;
        //switch后面的（）中可以传入枚举类型
        //switch后面的（）:int,short,byte,char,String ,枚举
        switch (sex){
            case 女:
                System.out.println("是个女孩");
                break;
            case 男:
                System.out.println("是个男孩");
                break;
        }
    }
}