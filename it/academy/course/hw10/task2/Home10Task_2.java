package it.academy.course.hw10.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Home10Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text");
        String text = in.nextLine();
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word
                    .toLowerCase()
                    .replaceAll("[^a-zA-Zа-яА-Я]", "");
            if (word.length() > 0) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
