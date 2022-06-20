package com.base.java.enum1.枚举类实现接口;

public enum Season2 implements TestInterface {
    SPRING {
        /**
         * 简介: 不同的对象调用show方法返回的都一样
         */
        @Override
        public void show() {
            System.out.println("这是春天。。。");
        }
    },
    SUMMER {
        @Override
        public void show() {
            System.out.println("这是夏天。。");
        }
    },
    AUTUMN {
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WINTER {
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };
    /*@Override
    public void show() {
        System.out.println("这是Season....");
    }*/
}
