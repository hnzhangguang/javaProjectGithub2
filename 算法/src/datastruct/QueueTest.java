package datastruct;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueTest {


    public static void main(String[] args) {

    }


    /**
     * 简介: 以链表方式实现队列
     * 功能:
     *  作者: zhangg
     */
    public class stackDemo {
        private LinkedList<String> stackList = new LinkedList<>();

        //入栈
        public void push(String str) {
            stackList.addFirst(str);
        }

        public String pop() {
            return stackList.removeFirst();
        }

        //判断是否为空
        public boolean empty() {
            return stackList.isEmpty();
        }

        //打印栈内所有元素
        public void printStack() {
            Iterator iterator = stackList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next() + " ");
            }
            System.out.println();
        }
    }

}
