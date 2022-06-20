package com.base.java.reflect;

public class Test1 {
    public static void main(String[] args) {
        //定义一个字符串，用来模拟前台的支付方式：
        String str = "微信";
        if("微信".equals(str)){//str.equals("微信")---？避免空指针异常
            //微信支付：
            //new WeChat().payOnline();
            pay(new WeChat());
        }
        if("支付宝".equals(str)){
            //支付宝支付：
            //new AliPay().payOnline();
            pay(new AliPay());
        }
        if("招商银行".equals(str)){
            pay(new BankCard());
        }
    }
    //微信支付
    public static void pay(WeChat wc){
        wc.payOnline();
    }
    //支付宝支付
    public static void pay(AliPay ap){
        ap.payOnline();
    }
    //招商银行支付
    public static void pay(BankCard bc){
        bc.payOnline();
    }
}