package it.academy.course.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Home6Task_7 {
    public static void main(String[] args) {
        String email1 = "myemail@gmail.com";
        String email2 = "a.petrov@gmail.com.au";
        String email3 = "coder4575@yandex.ru";
        System.out.println(examination(email1));
        System.out.println(examination(email2));
        System.out.println(examination(email3));

    }
    public static boolean examination(String valid){
        Pattern pattern = Pattern.compile("\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)\\.\\w{2,4}");
        Matcher matcher = pattern.matcher(valid);
        return matcher.matches();
    }
}
