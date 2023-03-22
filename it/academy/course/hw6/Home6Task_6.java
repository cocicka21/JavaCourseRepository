package it.academy.course.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Home6Task_6 {
    public static void main(String[] args) {
        String sentence = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
        String regex = "Java\\s+\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
