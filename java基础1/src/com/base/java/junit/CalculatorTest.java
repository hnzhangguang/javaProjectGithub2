package com.base.java.junit;


import org.junit.*;


/**
 * ���: junit �� assert ����
 * @Before  , @Test , @After   ִ��˳��-->
 *
 *
 */
public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("����ִ�п�ʼ�ˡ�����");
    }

    //����add����
    @Test
    public void testAdd(){
        System.out.println("����add����");
        Calculator cal = new Calculator();
        int result = cal.add(10, 30);
        //System.out.println(result);--����������н�����Բ���ע
        //������ԣ�Ԥ��һ�½�����ж�һ����Ԥ��Ľ���� ʵ�ʵĽ���Ƿ�һ�£�
        Assert.assertEquals(40,result);//��һ��������Ԥ����  �ڶ���������ʵ�ʽ��
    }
    //����sub����
    @Test
    public void testSub(){
        System.out.println("����sub����");
        Calculator cal = new Calculator();
        int result = cal.sub(10, 30);
        System.out.println(result);
    }

    @After
    public void close(){
        System.out.println("����ִ�н����ˡ�����");
    }

}