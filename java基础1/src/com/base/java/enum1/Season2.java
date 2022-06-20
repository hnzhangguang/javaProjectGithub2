package com.base.java.enum1;


/**
 * 简介:
 * 为什么这么简单：因为这个枚举类底层没有属性，属性，构造器，toString，get方法都删掉不写了，然后案例来说应该
 * 写为：SPRING()   现在连（）可以省略 就变成  SPRING
 * 看到的形态就剩：常量名（对象名）
 *
 *
 */
public enum Season2 {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;
}