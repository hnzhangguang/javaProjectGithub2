package com.base.java.enum1.ö����ʵ�ֽӿ�;

public enum Season2 implements TestInterface {
    SPRING {
        /**
         * ���: ��ͬ�Ķ������show�������صĶ�һ��
         */
        @Override
        public void show() {
            System.out.println("���Ǵ��졣����");
        }
    },
    SUMMER {
        @Override
        public void show() {
            System.out.println("�������졣��");
        }
    },
    AUTUMN {
        @Override
        public void show() {
            System.out.println("��������");
        }
    },
    WINTER {
        @Override
        public void show() {
            System.out.println("���Ƕ���");
        }
    };
    /*@Override
    public void show() {
        System.out.println("����Season....");
    }*/
}
