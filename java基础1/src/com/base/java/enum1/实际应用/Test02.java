package com.base.java.enum1.ʵ��Ӧ��;


/**
 * ���: ͨ��ö�ٽ��switch����
 */
public class Test02 {
    //����һ��main�������ǳ������ڣ�
    public static void main(String[] args) {
        Gender sex = Gender.��;
        //switch����ģ����п��Դ���ö������
        //switch����ģ���:int,short,byte,char,String ,ö��
        switch (sex){
            case Ů:
                System.out.println("�Ǹ�Ů��");
                break;
            case ��:
                System.out.println("�Ǹ��к�");
                break;
        }
    }
}