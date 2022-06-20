package com.base.java.reflect.获取字节码方式;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //案例：以Person的字节码信息为案例
        //方式1：通过getClass()方法获取
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);
        //方式2：通过内置class属性：
        Class c2 = Person.class;
        System.out.println(c2);
        System.out.println(c1==c2);
        //注意：方式1和方式2  不常用
        //方式3：--》用的最多：调用Class类提供的静态方法forName
        Class c3 = Class.forName("com.zhaoss.test02.Person");
        //方式4：利用类的加载器(了解技能点)
        ClassLoader loader = Test1.class.getClassLoader();
        Class c4 = loader.loadClass("com.zhaoss.test02.Person");



        /*
        Class类的具体的实例：
        （1）类：外部类，内部类
        （2）接口
        （3）注解
        （4）数组
        （5）基本数据类型
        （6）void
         */
        Class c11 = Person.class;
        Class c12 = Comparable.class;
        Class c13 = Override.class;


        int[] arr11 = {1,2,3};
        Class c14 = arr11.getClass();
        int[] arr12 = {5,6,7};
        Class c15 = arr12.getClass();
        System.out.println(c14==c15);//结果：true .同一个维度，同一个元素类型,得到的字节码就是同一个




    }
}
