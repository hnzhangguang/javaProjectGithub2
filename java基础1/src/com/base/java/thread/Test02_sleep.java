package com.base.java.thread;

import java.text.*;
import java.util.*;

/**
 * sleep
 * 秒表的实现...
 *
 */
public class Test02_sleep {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //2.定义一个时间格式：
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        while(true){
            //1.获取当前时间：
            Date d = new Date();
            //3.按照上面定义的格式将Date类型转为指定格式的字符串：
            System.out.println(df.format(d));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}