package com.base.java.reflect.����ʱ��������ṹ;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * ���: ��ȡ�����͵��÷���
 */
public class Test03 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //��ȡ�ֽ�����Ϣ��
        Class cls = Student.class;
        //��ȡ������
        //getMethods:��ȡ����ʱ��ķ����������и����еķ�������public���Σ�
        Method[] methods = cls.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("-----------------------");
        //getDeclaredMethods:��ȡ����ʱ���е����з�����
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
        System.out.println("-----------------------");
        //��ȡָ���ķ�����
        Method showInfo1 = cls.getMethod("showInfo");
        System.out.println(showInfo1);
        Method showInfo2 = cls.getMethod("showInfo", int.class, int.class);
        System.out.println(showInfo2);
        Method work = cls.getDeclaredMethod("work", int.class);
        System.out.println(work);
        System.out.println("-----------------------");
        //��ȡ�����ľ���ṹ��
        /*
        @ע��
        ���η� ����ֵ����  ������(�����б�) throws XXXXX{}
         */
        //���֣�
        System.out.println(work.getName());
        //���η���
        int modifiers = work.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        //����ֵ��
        System.out.println(work.getReturnType());
        //�����б�
        Class[] parameterTypes = work.getParameterTypes();
        for (Class c : parameterTypes) {
            System.out.println(c);
        }
        //��ȡע�⣺
        Method myMethod = cls.getMethod("myMethod");
        Annotation[] annotations = myMethod.getAnnotations();//����ע��
        for (Annotation a : annotations) {
            System.out.println(a);
        }
        //��ȡ�쳣��
        Class[] exceptionTypes = myMethod.getExceptionTypes();//�쳣����
        for (Class c : exceptionTypes) {
            System.out.println(c);
        }
        //���÷�����
        Object o = cls.newInstance();
        myMethod.invoke(o);//����o�����mymethod����
        System.out.println(showInfo2.invoke(o, 12, 45));
        ;
    }
}
