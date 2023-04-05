package it.academy.course.hw15.Home15Task_2;

import java.util.*;

public class Home15Task_2 {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            col.add((int) (Math.random() * 101));
        }
        System.out.println(col);
        Integer minNumbers = col.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println("min number :" + minNumbers);
        Integer maxNumbers = col.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println("max number :" + maxNumbers);
        double avgNumbers = col.stream()
                .mapToDouble(s -> s)
                .average()
                .getAsDouble();
        System.out.println("average of all numbers :" + avgNumbers);
        Integer multiNumbers = col.stream()
                .reduce((a, b) -> a * b)
                .get();
        System.out.println("product of all numbers :" + multiNumbers);
        Integer sumNumbers = col.stream()
                .reduce(Integer::sum)
                .get();
        System.out.println("sum of all numbers :" + sumNumbers);
        int sumOfDigits = col.stream()
                .map(x -> Integer.toString(x))
                .flatMapToInt(CharSequence::chars)
                .map(Character::getNumericValue)
                .sum();
        System.out.println("sum of all digits :" + sumOfDigits);
    }
}
