package datastruct.link;

/**
 * ���: ˫������
 * ����:
 *  ����: zhangg
 */
public class MyDoublyLinkList<E> implements MyList<E> {

    /**
     * ����˫������ڵ�
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
     * ���ڵ���ӵ�β��
     *
     * @param item
     * @return
     */
    @Override
    public void add(E item) {
        this.linkLast(item);
    }

    /**
     * ���һ��Ԫ�ص�β��
     *
     * @param e
     */
    private void linkLast(E e) {
        //��ȡtail
        Node<E> node = this.tail;
        //����һ��node
        Node<E> newNode = new Node<>(node, e, null);
        this.tail = newNode;
        if (node == null)
            this.head = newNode;
        else
            node.next = newNode;
        size++;
    }

    /**
     * ��ȡָ��λ��Ԫ��
     * @param index
     * @return
     */

    @Override
    public E get(int index) {
        //У��index�Ƿ�Ϸ�
        checkIndex(index);
        //��ȡindexԪ��
        return getNode(index).item;
    }

    /**
     * У��index�Ϸ���
     *
     * @param index
     */
    private void checkIndex(int index) {
        if (!(index >= 0 && index < this.size))
            throw new IndexOutOfBoundsException(String.format("index out of bounds,index:%s,size:%s", index, this.size));
    }

    /**
     * ��ȡnode
     *
     * @param index
     * @return
     */
    private Node<E> getNode(int index) {
        if (index > (size >> 1)) {
            Node<E> node = this.tail;
            //��tail��ǰ����
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        } else {
            //��head������
            Node<E> node = this.head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }
    }

    /**
     * ɾ��ָ��λ��Ԫ��
     *
     * @param index
     * @return
     */
    @Override
    public E remove(int index) {
        //�ж�index�Ϸ���
        this.checkIndex(index);
        Node<E> node = getNode(index);
        E e = node.item;
        //�ж��Ƿ�Ϊͷ�ڵ�
        if (node.prev == null) {
            this.head = node.next;
        } else {
            node.prev.next = node.next;
            node.prev = null;
        }
        //�ж��Ƿ�Ϊβ�ڵ�
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
     * ��ȡ������
     *
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    }

