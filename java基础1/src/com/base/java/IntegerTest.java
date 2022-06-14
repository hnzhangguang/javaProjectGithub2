package com.base.java;

import java.text.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.*;

public class IntegerTest {


    public static void main(String[] args) throws InterruptedException {
        Integer i5 = 130;
        Integer i6 = 130;
        System.out.println(i5.equals(i6));//true
        System.out.println(i5 == i6);//false 不同的对象



        //java.util.Date:
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.toGMTString());//过期方法，过时方法，废弃方法。
        System.out.println(d.toLocaleString());
        System.out.println(d.getYear());//120+1900=2020
        System.out.println(d.getMonth());//5 :返回的值在 0 和 11 之间，值 0 表示 1 月。
        //返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        System.out.println(d.getTime());//1592055964263
        System.out.println(System.currentTimeMillis());
        /*
        （1）疑问：以后获取时间差用：getTime()还是currentTimeMillis()
        答案：currentTimeMillis()--》因为这个方法是静态的，可以类名.方法名直接调用
        （2）public static native long currentTimeMillis();
        本地方法
        为什么没有方法体？因为这个方法的具体实现不是通过java写的。
        （3）这个方法的作用：
        一般会去衡量一些算法所用的时间
         */
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);



        //日期转换：
        //SimpleDateFormat(子类) extends DateFormat（父类是一个抽象类）
        //格式化的标准已经定义好了：
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String--->Date
        try {
            Date date = df.parse("2019-4-6 12:23:54");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Date--->String
        String format = df.format(new Date());
        System.out.println(format);


        // 定义格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = sdf.format(new Date());//当前时间按上述格式输出
        System.out.println(format1);


        // 日期类Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.getActualMaximum(Calendar.DATE));//获取当月日期的最大天数
        System.out.println(cal.getActualMinimum(Calendar.DATE));//获取当月日期的最小天数
        // set方法：可以改变Calendar中的内容
        cal.set(Calendar.YEAR,1990);
        cal.set(Calendar.MONTH,3);
        cal.set(Calendar.DATE,16);
        System.out.println(cal);

        //String--->java.sql.Date:
        java.sql.Date date = java.sql.Date.valueOf("2020-4-5");
        //java.sql.Date-->Calendar:
        cal.setTime(date);
        System.out.println();
        System.out.println(cal);



        //1.完成实例化：
        //方法1：now()--获取当前的日期，时间，日期+时间
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //方法2：of()--设置指定的日期，时间，日期+时间
        LocalDate of = LocalDate.of(2010, 5, 6);
        System.out.println(of);
        LocalTime of1 = LocalTime.of(12, 35, 56);
        System.out.println(of1);
        LocalDateTime of2 = LocalDateTime.of(1890, 12, 23, 13, 24, 15);
        System.out.println(of2);

        //不是set方法，叫with
        //体会：不可变性
        LocalDateTime localDateTime2 = localDateTime.withMonth(8);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        //提供了加减的操作：
        //加：
        LocalDateTime localDateTime1 = localDateTime.plusMonths(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        //减：
        LocalDateTime localDateTime3 = localDateTime.minusMonths(5);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);


        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("abc")==sb.append("def"));//true 比较的是地址


        // 阻塞队列的使用
        BlockingQueue<String> blockingQueue = new  ArrayBlockingQueue<String>(100);
        boolean zhang = blockingQueue.offer("zhang");
        boolean guan = blockingQueue.offer("guan");// 能够顺利插入时候返回true , 不能顺利插入时候返回false
        blockingQueue.add("aaa");// 能够顺利插入时候返回true , 不能顺利插入时直接报错...
        //put是阻塞的
        blockingQueue.put("zhang");//将制定元素插入到队列中, 将等待可用空间;

        //take是阻塞的
        String take = blockingQueue.take();//获取并移除此队列的头部,在元素变为可用之前一直等待


        boolean isSuccess = blockingQueue.remove("zhang");






    }
}
