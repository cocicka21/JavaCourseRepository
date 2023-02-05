package it.academy.course.cocicka;

import java.util.Scanner;

public class HomeTask_5 {
    public static void main(String[] args) {
        System.out.println("\nTask-5");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any number");
        int reNumber = in.nextInt();
        if (reNumber % 2 == 0) {
            System.out.println("0");
        } else (reNumber % 2 != 0) {
            System.out.println(reNumber % 2);
        }
    }
}
