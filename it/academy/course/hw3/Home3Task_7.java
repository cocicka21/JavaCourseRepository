package it.academy.course.hw3;

import java.util.Scanner;

public class Home3Task_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first single digit number");
        int FirstNumber = in.nextInt();
        System.out.println("Enter the second single digit number");
        int SecondNumber = in.nextInt();
        System.out.println("What is the result of multiplying the first number by the second?");
        int result = in.nextInt();
        if (result == FirstNumber * SecondNumber){
            System.out.println("True");
        } else {
            result = FirstNumber * SecondNumber;
            System.out.println("False\nCorrect answer = " + result);
        }
    }
}
