package com.base.java.reflect.��ȡ�ֽ��뷽ʽ;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //��������Person���ֽ�����ϢΪ����
        //��ʽ1��ͨ��getClass()������ȡ
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);
        //��ʽ2��ͨ������class���ԣ�
        Class c2 = Person.class;
        System.out.println(c2);
        System.out.println(c1==c2);
        //ע�⣺��ʽ1�ͷ�ʽ2  ������
        //��ʽ3��--���õ���ࣺ����Class���ṩ�ľ�̬����forName
        Class c3 = Class.forName("com.zhaoss.test02.Person");
        //��ʽ4��������ļ�����(�˽⼼�ܵ�)
        ClassLoader loader = Test1.class.getClassLoader();
        Class c4 = loader.loadClass("com.zhaoss.test02.Person");



        /*
        Class��ľ����ʵ����
        ��1���ࣺ�ⲿ�࣬�ڲ���
        ��2���ӿ�
        ��3��ע��
        ��4������
        ��5��������������
        ��6��void
         */
        Class c11 = Person.class;
        Class c12 = Comparable.class;
        Class c13 = Override.class;


        int[] arr11 = {1,2,3};
        Class c14 = arr11.getClass();
        int[] arr12 = {5,6,7};
        Class c15 = arr12.getClass();
        System.out.println(c14==c15);//�����true .ͬһ��ά�ȣ�ͬһ��Ԫ������,�õ����ֽ������ͬһ��




    }
}
