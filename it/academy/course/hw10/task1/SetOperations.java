package it.academy.course.hw10.task1;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<?> union(Set<?> set1, Set<?> set2) {
        Set<Object> resultUnion = new HashSet<>(set1);
        resultUnion.addAll(set2);
        return resultUnion;
    }

    public static Set<?> intersect(Set<?> set1, Set<?> set2) {
        Set<?> resultIntersect = new HashSet<>(set1);
        resultIntersect.retainAll(set2);
        return resultIntersect;
    }

    public static void printSet(String name, Set set) {
        System.out.printf("%s: %s\n", name, set);
    }
}
