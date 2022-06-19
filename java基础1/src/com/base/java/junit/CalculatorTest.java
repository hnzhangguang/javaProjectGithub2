package com.base.java.junit;


import org.junit.*;


/**
 * 简介: junit 和 assert 断言
 * @Before  , @Test , @After   执行顺序-->
 *
 *
 */
public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("方法执行开始了。。。");
    }

    //测试add方法
    @Test
    public void testAdd(){
        System.out.println("测试add方法");
        Calculator cal = new Calculator();
        int result = cal.add(10, 30);
        //System.out.println(result);--》程序的运行结果可以不关注
        //加入断言：预测一下结果，判断一下我预测的结果和 实际的结果是否一致：
        Assert.assertEquals(40,result);//第一个参数：预测结果  第二个参数：实际结果
    }
    //测试sub方法
    @Test
    public void testSub(){
        System.out.println("测试sub方法");
        Calculator cal = new Calculator();
        int result = cal.sub(10, 30);
        System.out.println(result);
    }

    @After
    public void close(){
        System.out.println("方法执行结束了。。。");
    }

}