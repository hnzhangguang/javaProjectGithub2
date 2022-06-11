package datastruct.link;

/**
 * 简介: 双向链表
 * 功能:
 *  作者: zhangg
 */
public class MyDoublyLinkList<E> implements MyList<E> {

    /**
     * 定义双向链表节点
     */
    class Node<E> {
        Node<E> prev;
        E item;
        Node<E> next;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    /**
     * 将节点添加到尾部
     *
     * @param item
     * @return
     */
    @Override
    public void add(E item) {
        this.linkLast(item);
    }

    /**
     * 添加一个元素到尾部
     *
     * @param e
     */
    private void linkLast(E e) {
        //获取tail
        Node<E> node = this.tail;
        //创建一个node
        Node<E> newNode = new Node<>(node, e, null);
        this.tail = newNode;
        if (node == null)
            this.head = newNode;
        else
            node.next = newNode;
        size++;
    }

    /**
     * 获取指定位置元素
     * @param index
     * @return
     */

    @Override
    public E get(int index) {
        //校验index是否合法
        checkIndex(index);
        //获取index元素
        return getNode(index).item;
    }

    /**
     * 校验index合法性
     *
     * @param index
     */
    private void checkIndex(int index) {
        if (!(index >= 0 && index < this.size))
            throw new IndexOutOfBoundsException(String.format("index out of bounds,index:%s,size:%s", index, this.size));
    }

    /**
     * 获取node
     *
     * @param index
     * @return
     */
    private Node<E> getNode(int index) {
        if (index > (size >> 1)) {
            Node<E> node = this.tail;
            //从tail向前遍历
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        } else {
            //从head向后遍历
            Node<E> node = this.head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }
    }

    /**
     * 删除指定位置元素
     *
     * @param index
     * @return
     */
    @Override
    public E remove(int index) {
        //判断index合法性
        this.checkIndex(index);
        Node<E> node = getNode(index);
        E e = node.item;
        //判断是否为头节点
        if (node.prev == null) {
            this.head = node.next;
        } else {
            node.prev.next = node.next;
            node.prev = null;
        }
        //判断是否为尾节点
        if (node.next == null) {
            this.tail = node.next;
        } else {
            node.next.prev = node.prev;
            node.next = null;
        }
        node.item = null;
        size--;
        return e;
    }

    /**
     * 获取链表长度
     *
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    }

