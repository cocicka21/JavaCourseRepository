package it.academy.course.hw15.Home15Task_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Home15Task_3 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        List<String> filteredList = myList.stream()
                .filter(str -> !str.contains("3"))
                .collect(Collectors.toList());
        List<String> sortedList = filteredList.stream()
                .sorted(Comparator.comparing(s -> Integer.parseInt(s.substring(1))))
                .collect(Collectors.toList());
        List<String> result = sortedList.stream()
                .skip(1)
                .limit(myList.size() - 2)
                .collect(Collectors.toList());
        List<String> upperCaseList = result.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseList);
    }
}
