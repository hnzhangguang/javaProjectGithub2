package com.base.java.reflect.����ʱ��������ṹ;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ���: ��ȡ�������ʹ�������
 */
public class Test01 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //��ȡ�ֽ�����Ϣ��
        Class cls = Student.class;
        //ͨ���ֽ�����Ϣ���Ի�ȡ��������
        //getConstructorsֻ�ܻ�ȡ��ǰ����ʱ��ı�public���εĹ�����
        Constructor[] c1 = cls.getConstructors();
        for (Constructor c : c1) {
            System.out.println(c);
        }
        System.out.println("-------------------");
        //getDeclaredConstructors:��ȡ����ʱ���ȫ�����η��Ĺ�����
        Constructor[] c2 = cls.getDeclaredConstructors();
        for (Constructor c : c2) {
            System.out.println(c);
        }
        System.out.println("-------------------");
        //��ȡָ���Ĺ�������
        //�õ��չ�����
        Constructor con1 = cls.getConstructor();
        System.out.println(con1);
        //�õ������������вι�������
        Constructor con2 = cls.getConstructor(double.class, double.class);
        System.out.println(con2);
        //�õ�һ���������вι�������������private���ε�
        Constructor con3 = cls.getDeclaredConstructor(int.class);
        System.out.println(con3);
        //���˹������Ժ��ҾͿ��Դ�������
        Object o1 = con1.newInstance();
        System.out.println(o1);
        Object o2 = con2.newInstance(180.5, 170.6);
        System.out.println(o2);
    }
}
