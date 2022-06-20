package com.base.java.enum1;


/**
 * 简介: 定义季节
 */
public enum Season {

    //提供枚举类的有限的  确定的对象：--->enum枚举类要求对象（常量）必须放在最开始位置
    //多个对象之间用，进行连接，最后一个对象后面用;结束
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "硕果累累"),
    WINTER("冬天", "冰天雪地");

    //属性：
    private final String seasonName;//季节名字
    private final String seasonDesc;//季节描述

    //利用构造器对属性进行赋值操作：
    //构造器私有化，外界不能调用这个构造器，只能Season内部自己调用
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //额外因素：
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //toString();
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}