package com.base.java.thread;

/**
 * join��������һ���̵߳�����join����������߳̾ͻ��ȱ�ִ�У���ִ�н����Ժ�ſ���ȥִ��������̡߳�
 * ע�⣺������start����join����Ч��
 */
public class TestThread_join extends Thread {
    public TestThread_join(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(this.getName()+"----"+i);
        }
    }
}
class Test{
    //����main��������������
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("main-----"+i);
            if(i == 6){
                //�������̣߳�
                TestThread_join tt = new TestThread_join("���߳�");
                tt.start();
                tt.join();//����·ɱ������ҧ��
            }
        }
    }
}