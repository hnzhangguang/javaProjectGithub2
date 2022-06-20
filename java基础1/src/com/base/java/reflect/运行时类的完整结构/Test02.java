package com.base.java.reflect.����ʱ��������ṹ;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * ���: ��ȡ���ԺͶ����Խ��и�ֵ
 */
public class Test02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        //��ȡ����ʱ����ֽ�����Ϣ��
        Class cls = Student.class;
        //��ȡ���ԣ�
        //getFields����ȡ����ʱ��͸����б�public���ε�����
        Field[] fields = cls.getFields();
        for(Field f:fields){
            System.out.println(f);
        }
        System.out.println("---------------------");
        //getDeclaredFields����ȡ����ʱ���е���������
        Field[] declaredFields = cls.getDeclaredFields();
        for(Field f:declaredFields){
            System.out.println(f);
        }
        System.out.println("---------------------");
        //��ȡָ�������ԣ�
        Field score = cls.getField("score");
        System.out.println(score);
        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);
        System.out.println("---------------------");
        //���Եľ���ṹ��
        //��ȡ���η�
        /*int modifiers = sno.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.toString(modifiers));*/
        System.out.println(Modifier.toString(sno.getModifiers()));
        //��ȡ���Ե��������ͣ�
        Class clazz = sno.getType();
        System.out.println(clazz.getName());
        //��ȡ���Ե����֣�
        String name = sno.getName();
        System.out.println(name);
        System.out.println("-------------------------------");
        //�����Ը�ֵ��(����������ֵ������Ҫ�ж���)
        Field sco = cls.getField("score");
        Object obj = cls.newInstance();
        sco.set(obj,98);//��obj��������score�������þ����ֵ�����ֵΪ98
        System.out.println(obj);
    }
}
