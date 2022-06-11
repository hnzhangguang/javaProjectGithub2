package datastruct.link;

public interface MyList<E> {
 
    void add(E node);
 
    E get(int index);
 
    E remove(int index);
 
    int size();
}