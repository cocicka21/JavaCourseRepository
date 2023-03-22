package it.academy.course.hw6;

import java.util.regex.Pattern;

public class Home6Task_5 {
    public static void main(String[] args) {
        String sentence = "Object-oriented programming is a programming language model organized around objects rather than 'actions' and data rather than logic. " +
                "Object-oriented programming blabla." +
                "Object-oriented programming bla." +
                "Object-oriented programming fsdg;isdfligdsf." +
                "Object-oriented programming fsdgariu;iejrklsd fsdfiweqir;lsdjf.";
        String regex = "Object-oriented programming";
        Pattern pattern = Pattern.compile(regex);
        String[] arrSentence = sentence.split(regex);
        for (int i = 1; i < arrSentence.length; i++){
            arrSentence[i] = regex + arrSentence[i];
        }
        for (int i = 0; i < arrSentence.length; i = i + 2){
            arrSentence[i] = arrSentence[i].replaceAll(pattern.pattern(), "OOP");
        }
        StringBuilder buildSentence = new StringBuilder();
        for (String elem : arrSentence){
            buildSentence.append(elem);
        }
        System.out.println(buildSentence);
    }
}
