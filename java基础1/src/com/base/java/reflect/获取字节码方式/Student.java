package com.base.java.reflect.��ȡ�ֽ��뷽ʽ;

//Student��Ϊ����
public class Student extends Person {
    //���ԣ�
    private int sno;//ѧ��
    double height;//���
    protected double weight;//����
    public double score;//�ɼ�
    //������
    public String showInfo(){
        return "����һ������ѧ��";
    }
    private void work(){
        System.out.println("���Ժ���ҹ���--����Ϊ��ũ  ����Ա ����Գ  ������");
    }
    //������
    public Student(){
        System.out.println("�ղι�����");
    }
    private Student(int sno){
        this.sno = sno;
    }
    Student(int sno,double weight){
        this.sno = sno;
        this.weight = weight;
    }
}