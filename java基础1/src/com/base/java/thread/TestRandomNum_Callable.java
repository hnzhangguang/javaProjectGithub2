package com.base.java.thread;

import java.util.*;
import java.util.concurrent.*;

/**
 * �ŵ�:
 * 1, �з���ֵ
 * 2, �����׳��쳣��Ϣ
 *
 */
public class TestRandomNum_Callable implements Callable<Integer> {
    /*
    1.ʵ��Callable�ӿڣ����Բ������ͣ�����������ͣ���ôcall��ʽ�ķ���ֵ����Object����
    2.��������ͣ���ôcall�ķ���ֵ���Ƿ��Ͷ�Ӧ������
    3.��call���������������з���ֵ�������ܳ��쳣
     */
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);//����10���ڵ������
    }
}


class Test_Callable{
    //����main��������������
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //����һ���̶߳���
        TestRandomNum_Callable trn = new TestRandomNum_Callable();
        FutureTask ft = new FutureTask(trn);//�ؼ�һ��!!!
        Thread t = new Thread(ft);
        t.start();
        //��ȡ�̵߳õ��ķ���ֵ��
        Object obj = ft.get();
        System.out.println(obj);
    }
}
