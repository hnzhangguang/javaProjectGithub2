package com.base.java.reflect;

import java.lang.reflect.*;


/**
 * ���:
 * ��̬ȷʵ������ߴ������չ�ԣ����ǣ���չ��û�дﵽ��á�
 * ��ôû�дﵽ��ã�����ķ�֧��������Ҫ�ֶ���ɾ��������ӡ�
 * ����취���������
 * ���÷���ʵ���������ܣ�
 */
public class Test3Demo {
    public static void main(String[] args) throws Exception {
        //����һ���ַ���������ģ��ǰ̨��֧����ʽ��
        String str = "com.zhaoss.test01.AliPay";  //�ַ�����ʵ���ϣ�����΢�����ȫ�޶�·��
        //����Ĵ���������÷��䣺
        Class  cls = Class.forName(str);//cls-->Class�����Ķ���--��AliPay�ֽ�����Ϣ
        Object o = cls.newInstance();
        Method method = cls.getMethod("payOnline");
        method.invoke(o);
    }
}
