package main.java.com.mayikt.method;


import java.util.Optional;

/**
 * @ClassName Test03
 * @Author 蚂蚁课堂余胜军 QQ644064779 www.mayikt.com
 * @Version V1.0
 **/
public class Test03 {
    public static void main(String[] args) {
        Integer a1 = 16;
        Optional<Integer> a = Optional.ofNullable(a1);
        a.ifPresent(integer -> {
            System.out.println(integer);

        });
//        boolean isPresent = a.filter(a2 -> a2 > 17).isPresent();
//        System.out.println(isPresent);
    }
}
