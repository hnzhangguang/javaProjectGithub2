package datastruct;


import java.util.*;

/**
 * ���: ջ��ʹ��
 * ����:
 */
public class StackTest {


    static void showpush(Stack<Integer> st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String args[]) {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }


    /**
     * ���: ��������ʵ��һ��ջ
     * ����:
     *  ����: zhangg
     */
    class Stack1<I extends Number> {
        Queue<Integer> queueA = new ArrayDeque<>();
        Queue<Integer> queueB = new ArrayDeque<>();

        //��ջ
        public void push(int n){
            queueA.add(n);
        }

        public int pop(){
            // ���queueAΪ��,queueB��Ԫ��,��queueB��Ԫ�����η���queueA��,ֱ�����һ��Ԫ��,���ǵ���
            if (queueA.isEmpty()){
                while (queueB.size()>1){
                    queueA.add(queueB.poll());//poll()�Ƴ������ض��е�ͷԪ��,�������Ϊ��,�򷵻�null
                }
                return queueB.poll();
            }
            if (queueB.isEmpty()){
                while (queueA.size()>1){
                    queueB.add(queueA.poll());
                }
                return queueA.poll();
            }
            return -1;
        }

    }




    /**
     * ���: ��̬��������ʵ�ֶ�ջ�ṹ
     * ����:
     *  ����: zhangg
     */
    class MyStack {
        private List<Integer> data;               // store elements
        public MyStack() {
            data = new ArrayList<>();
        }
        /** Insert an element into the stack. */
        public void push(int x) {
            data.add(x);
        }
        /** Checks whether the queue is empty or not. */
        public boolean isEmpty() {
            return data.isEmpty();
        }
        /** Get the top item from the queue. */
        public int top() {
            return data.get(data.size() - 1);
        }
        /** Delete an element from the queue. Return true if the operation is successful. */
        public boolean pop() {
            if (isEmpty()) {
                return false;
            }
            data.remove(data.size() - 1);
            return true;
        }
    };




}
