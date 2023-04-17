package it.academy.course.hw15.Home15Task_2;

import java.util.*;

public class Home15Task_2 {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            col.add((int) (Math.random() * 101));
        }
        System.out.println(col);
        Optional<Integer> minNumbers = col.stream()
                .min(Comparator.naturalOrder());
        minNumbers.ifPresent(integer -> System.out.println("min number :" + integer));
        Optional<Integer> maxNumbers = col.stream()
                .max(Comparator.naturalOrder());
        maxNumbers.ifPresent(integer -> System.out.println("max number :" + integer));
        OptionalDouble avgNumbers = col.stream()
                .mapToDouble(s -> s)
                .average();
        if (avgNumbers.isPresent()) {
            System.out.println("average of all numbers :" + avgNumbers.getAsDouble());
        }
        Optional<Integer> multiNumbers = col.stream()
                .reduce((a, b) -> a * b);
        multiNumbers.ifPresent(integer -> System.out.println("product of all numbers :" + integer));
        Optional<Integer> sumNumbers = col.stream()
                .reduce(Integer::sum);
        sumNumbers.ifPresent(integer -> System.out.println("sum of all numbers :" + integer));
        int sumOfDigits = col.stream()
                .map(x -> Integer.toString(x))
                .flatMapToInt(CharSequence::chars)
                .map(Character::getNumericValue)
                .sum();
        System.out.println("sum of all digits :" + sumOfDigits);
    }
}
