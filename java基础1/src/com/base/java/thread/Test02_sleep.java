package com.base.java.thread;

import java.text.*;
import java.util.*;

/**
 * sleep
 * ����ʵ��...
 *
 */
public class Test02_sleep {
    //����main��������������
    public static void main(String[] args) {
        //2.����һ��ʱ���ʽ��
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        while(true){
            //1.��ȡ��ǰʱ�䣺
            Date d = new Date();
            //3.�������涨��ĸ�ʽ��Date����תΪָ����ʽ���ַ�����
            System.out.println(df.format(d));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}