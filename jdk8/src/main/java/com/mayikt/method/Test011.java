package main.java.com.mayikt.method;


import main.java.com.mayikt.entity.UserEntity;
import main.java.com.mayikt.service.UserInterface;

/**
 * @ClassName Test011
 * @Author 蚂蚁课堂余胜军 QQ644064779 www.mayikt.com
 * @Version V1.0
 **/
public class Test011 {
    public static void main(String[] args) {
//        UserInterface userInterface = () -> new UserEntity();
        UserInterface UserInterface2=  UserEntity::new;;
        UserInterface2.getUser();
    }
}
