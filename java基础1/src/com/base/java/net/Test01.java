package com.base.java.net;

import java.net.*;

public class Test01 {
    //����һ��main�������ǳ������ڣ�
    public static void main(String[] args) throws UnknownHostException {
        //��װIP��
        //InetAddress ia = new InetAddress();����ֱ�Ӵ���������ΪInetAddress()��default�����ˡ�
        InetAddress ia = InetAddress.getByName("192.168.199.217");
        System.out.println(ia);
        InetAddress ia2 = InetAddress.getByName("localhost");//localhostָ�����Ǳ�����ip��ַ
        System.out.println(ia2);
        InetAddress ia3 = InetAddress.getByName("127.0.0.1");//127.0.0.1ָ�����Ǳ�����ip��ַ
        System.out.println(ia3);
        InetAddress ia5 = InetAddress.getByName("www.mashibing.com");//��װ����
        System.out.println(ia5);
        System.out.println(ia5.getHostName());//��ȡ����
        System.out.println(ia5.getHostAddress());//��ȡip��ַ
    }
}