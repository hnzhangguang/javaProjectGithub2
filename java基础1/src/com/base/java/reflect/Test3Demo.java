package com.base.java.reflect;

import java.lang.reflect.*;


/**
 * 简介:
 * 多态确实可以提高代码的扩展性，但是：扩展性没有达到最好。
 * 怎么没有达到最好：上面的分支，还是需要手动的删除或者添加。
 * 解决办法：反射机制
 * 利用反射实现上述功能：
 */
public class Test3Demo {
    public static void main(String[] args) throws Exception {
        //定义一个字符串，用来模拟前台的支付方式：
        String str = "com.zhaoss.test01.AliPay";  //字符串：实际上：就是微信类的全限定路径
        //下面的代码就是利用反射：
        Class  cls = Class.forName(str);//cls-->Class类具体的对象--》AliPay字节码信息
        Object o = cls.newInstance();
        Method method = cls.getMethod("payOnline");
        method.invoke(o);
    }
}
