package com.base.java.reflect.����ʱ��������ṹ;

//Student��Ϊ����
@MyAnnotation(value = "hello")
public class Student extends Person implements MyInterface {
    //���ԣ�
    private int sno;//ѧ��
    double height;//���
    protected double weight;//����
    public double score;//�ɼ�

    //������
    @MyAnnotation(value = "himethod")
    public String showInfo() {
        return "����һ������ѧ��";
    }

    public String showInfo(int a, int b) {
        return "���ط���====����һ������ѧ��";
    }

    private void work() {
        System.out.println("���Ժ���ҹ���--����Ϊ��ũ  ����Ա ����Գ  ������");
    }

    void happy() {
        System.out.println("��������Ҫ�ľ��ǿ���ÿһ��");
    }

    protected int getSno() {
        return sno;
    }

    //������
    public Student() {
        System.out.println("�ղι�����");
    }

    private Student(int sno) {
        this.sno = sno;
    }

    Student(int sno, double weight) {
        this.sno = sno;
        this.weight = weight;
    }

    protected Student(int sno, double height, double weight) {
        this.sno = sno;
    }

    @Override
    @MyAnnotation(value = "hellomyMethod")
    public void myMethod() {
        System.out.println("����д��myMethod��������");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}