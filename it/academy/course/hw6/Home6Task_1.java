package it.academy.course.hw6;

public class Home6Task_1 {
    public static void main(String[] args) {
        String sentence = "   This  is     Java course      and     text  for    homework";
        sentence = sentence.replaceAll("\\s+", " ");
        sentence = sentence.trim();
        System.out.println(sentence);
    }
}
