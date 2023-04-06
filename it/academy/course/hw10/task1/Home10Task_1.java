package it.academy.course.hw10.task1;

import java.util.*;

public class Home10Task_1 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 2, 4, 14, 12, 5, 22, 55);
        SetOperations.printSet("set1", set1);
        Set<Integer> set2 = new LinkedHashSet<>();
        Collections.addAll(set2, 1, 4, 12, 15, 55, 11, 21, 29);
        SetOperations.printSet("set2", set2);
        Set<Integer> set3 = new TreeSet<>();
        Collections.addAll(set3, 2, 5, 40, 82, 41, 13, 12, 21);
        SetOperations.printSet("set3", set3);
        Set<Integer> set4 = SetOperations.intersect(set1, set2);
        SetOperations.printSet("set1 intersect set2", set4);
        SetOperations.printSet("set1 intersect set2 union set3", SetOperations.union(set4, set3));

    }
}
