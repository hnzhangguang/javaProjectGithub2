package datastruct.link;

public class DoubleLink {

    public static void main(String[] args) {
        MyList<String> stringMyList = new MyDoublyLinkList<>();
        System.out.println(stringMyList.size());
        stringMyList.add("a");
        stringMyList.add("b");
        stringMyList.add("c");
        stringMyList.add("d");
        System.out.println(stringMyList.size());
        String re = stringMyList.remove(1);
        System.out.println(re);
        for (int i = 0; i < stringMyList.size(); i++) {
            System.out.println(stringMyList.get(i));
        }
    }



}
