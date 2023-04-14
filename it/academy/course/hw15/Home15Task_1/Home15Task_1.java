package it.academy.course.hw15.Home15Task_1;

import java.util.*;
import java.util.stream.Collectors;

public class Home15Task_1 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("Hello world!");
        col.add("login");
        col.add("Password");
        col.add("123412516532");
        col.add("Boo");
        col.add("Goodbye world!!!");
        boolean contain = col.stream()
                .anyMatch(s -> s.equals("login"));
        System.out.println("Does any of the lines contain the word 'login' :" + contain);
        Optional<String> longest = col.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("Longest line if collection : " + longest.get());
        Optional<String> shortest = col.stream()
                .min(Comparator.comparingInt(String::length));
        System.out.println("Shortest line if collection : " + shortest.get());
        List<String> result = col.stream()
                .filter(s -> s.matches("[a-zA-z1-9]*"))
                .collect(Collectors.toList());
        System.out.println("Lines do not contain spaces or punctuation : " + result);
        List<String> allWords = col.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(line -> line.replaceAll("[^a-zA-Z]", ""))
                .filter(line -> line.length() > 0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("All words used in lines :" + allWords);
    }
}