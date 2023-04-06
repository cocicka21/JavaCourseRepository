package it.academy.course.hw10.task1;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> resultUnion = new HashSet<>(set1);
        resultUnion.addAll(set2);
        return resultUnion;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> resultIntersect = new HashSet<>(set1);
        resultIntersect.retainAll(set2);
        return resultIntersect;
    }

    public static void printSet(String name, Set set) {
        System.out.printf("%s: %s\n", name, set);
    }
}