package com.base.java.reflect;


/**
 * ���: Ϊ����ߴ������չ��---������������ԣ���̬��
 */
public class Test2 {
    public static void main(String[] args) {
        //����һ���ַ���������ģ��ǰ̨��֧����ʽ��
        String str = "΢��";
        if("΢��".equals(str)){//str.equals("΢��")---�������ָ���쳣
            //΢��֧����
            pay(new WeChat());
        }
        if("֧����".equals(str)){
            //֧����֧����
            pay(new AliPay());
        }
        if("��������".equals(str)){
            pay(new BankCard());
        }
    }
    //�����β��ǽӿڣ����崫����ǽӿڵ�ʵ����Ķ���---����̬��һ����ʽ
    public static void pay(Mtwm m){
        m.payOnline();
    }

}