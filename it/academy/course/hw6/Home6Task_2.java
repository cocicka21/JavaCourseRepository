package it.academy.course.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Home6Task_2 {
    public static void main(String[] args) {
        String sentence = "Given a string of 100500 digits, and the largest number is 939124329584 out of 5209434 possible";
        System.out.println(sentence);
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(sentence);
        int lenghtZero = 0;
        String maxLength = null;
        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            int lineLength = sentence.substring(start,end).length();
            if (lineLength > lenghtZero){
                lenghtZero = lineLength;
                maxLength = sentence.substring(start,end);
            }
        }
        System.out.println("The largest number of consecutive digits : " + maxLength);
    }
}
