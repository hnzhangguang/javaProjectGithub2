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
        System.out.println(i5 == i6);//false ��ͬ�Ķ���



        //java.util.Date:
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.toGMTString());//���ڷ�������ʱ����������������
        System.out.println(d.toLocaleString());
        System.out.println(d.getYear());//120+1900=2020
        System.out.println(d.getMonth());//5 :���ص�ֵ�� 0 �� 11 ֮�䣬ֵ 0 ��ʾ 1 �¡�
        //������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�������
        System.out.println(d.getTime());//1592055964263
        System.out.println(System.currentTimeMillis());
        /*
        ��1�����ʣ��Ժ��ȡʱ����ã�getTime()����currentTimeMillis()
        �𰸣�currentTimeMillis()--����Ϊ��������Ǿ�̬�ģ���������.������ֱ�ӵ���
        ��2��public static native long currentTimeMillis();
        ���ط���
        Ϊʲôû�з����壿��Ϊ��������ľ���ʵ�ֲ���ͨ��javaд�ġ�
        ��3��������������ã�
        һ���ȥ����һЩ�㷨���õ�ʱ��
         */
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);



        //����ת����
        //SimpleDateFormat(����) extends DateFormat��������һ�������ࣩ
        //��ʽ���ı�׼�Ѿ�������ˣ�
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


        // �����ʽ
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = sdf.format(new Date());//��ǰʱ�䰴������ʽ���
        System.out.println(format1);


        // ������Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.getActualMaximum(Calendar.DATE));//��ȡ�������ڵ��������
        System.out.println(cal.getActualMinimum(Calendar.DATE));//��ȡ�������ڵ���С����
        // set���������Ըı�Calendar�е�����
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



        //1.���ʵ������
        //����1��now()--��ȡ��ǰ�����ڣ�ʱ�䣬����+ʱ��
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //����2��of()--����ָ�������ڣ�ʱ�䣬����+ʱ��
        LocalDate of = LocalDate.of(2010, 5, 6);
        System.out.println(of);
        LocalTime of1 = LocalTime.of(12, 35, 56);
        System.out.println(of1);
        LocalDateTime of2 = LocalDateTime.of(1890, 12, 23, 13, 24, 15);
        System.out.println(of2);

        //����set��������with
        //��᣺���ɱ���
        LocalDateTime localDateTime2 = localDateTime.withMonth(8);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        //�ṩ�˼Ӽ��Ĳ�����
        //�ӣ�
        LocalDateTime localDateTime1 = localDateTime.plusMonths(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        //����
        LocalDateTime localDateTime3 = localDateTime.minusMonths(5);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);


        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("abc")==sb.append("def"));//true �Ƚϵ��ǵ�ַ


        // �������е�ʹ��
        BlockingQueue<String> blockingQueue = new  ArrayBlockingQueue<String>(100);
        boolean zhang = blockingQueue.offer("zhang");
        boolean guan = blockingQueue.offer("guan");// �ܹ�˳������ʱ�򷵻�true , ����˳������ʱ�򷵻�false
        blockingQueue.add("aaa");// �ܹ�˳������ʱ�򷵻�true , ����˳������ʱֱ�ӱ���...
        //put��������
        blockingQueue.put("zhang");//���ƶ�Ԫ�ز��뵽������, ���ȴ����ÿռ�;

        //take��������
        String take = blockingQueue.take();//��ȡ���Ƴ��˶��е�ͷ��,��Ԫ�ر�Ϊ����֮ǰһֱ�ȴ�


        boolean isSuccess = blockingQueue.remove("zhang");






    }
}
