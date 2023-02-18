package it.academy.course.hw3;

import java.util.Scanner;

public class Home3Task_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = in.nextInt();
        if (number % 2 == 1 && number > 0){
            System.out.println("Odd positive number");
        } else if (number % 2 == 0 && number < 0){
            System.out.println("even negative number");
        }

    }
}
