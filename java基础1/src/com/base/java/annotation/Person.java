package com.base.java.annotation;


/**
 * ���: �ĵ�ע��
 * ����:
 */
public class Person {

    /**
     * ������eat������ʵ����XXX���ܡ�
     *
     * @param num1 �Ͳ�����
     * @param num2 ���˼�����
     */
    public void eat(int num1, int num2) {
    }

    /**
     * @param age ����
     * @return int
     * @throws RuntimeException          ����������ʱ��
     * @throws IndexOutOfBoundsException �������С��ʱ��
     * @see Student
     */
    public int sleep(int age) {
        new Student();
        if (age > 100) {
            throw new RuntimeException();
        }
        if (age < 0) {
            throw new IndexOutOfBoundsException();
        }
        return 10;
    }
}
