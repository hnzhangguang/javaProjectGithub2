package datastruct;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueTest {


    public static void main(String[] args) {

    }


    /**
     * ���: ������ʽʵ�ֶ���
     * ����:
     *  ����: zhangg
     */
    public class stackDemo {
        private LinkedList<String> stackList = new LinkedList<>();

        //��ջ
        public void push(String str) {
            stackList.addFirst(str);
        }

        public String pop() {
            return stackList.removeFirst();
        }

        //�ж��Ƿ�Ϊ��
        public boolean empty() {
            return stackList.isEmpty();
        }

        //��ӡջ������Ԫ��
        public void printStack() {
            Iterator iterator = stackList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next() + " ");
            }
            System.out.println();
        }
    }

}
