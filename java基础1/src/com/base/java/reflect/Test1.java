package com.base.java.reflect;

public class Test1 {
    public static void main(String[] args) {
        //����һ���ַ���������ģ��ǰ̨��֧����ʽ��
        String str = "΢��";
        if("΢��".equals(str)){//str.equals("΢��")---�������ָ���쳣
            //΢��֧����
            //new WeChat().payOnline();
            pay(new WeChat());
        }
        if("֧����".equals(str)){
            //֧����֧����
            //new AliPay().payOnline();
            pay(new AliPay());
        }
        if("��������".equals(str)){
            pay(new BankCard());
        }
    }
    //΢��֧��
    public static void pay(WeChat wc){
        wc.payOnline();
    }
    //֧����֧��
    public static void pay(AliPay ap){
        ap.payOnline();
    }
    //��������֧��
    public static void pay(BankCard bc){
        bc.payOnline();
    }
}