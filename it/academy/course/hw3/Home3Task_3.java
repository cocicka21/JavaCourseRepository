package it.academy.course.hw3;

import java.util.Scanner;

public class Home3Task_3 {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number 1-7");
        int number = in.nextInt();
        switch (number){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
            case 7:
                System.out.println("Day off");
            default:
                System.out.println("Error! You entered a number outside the specified range");

        }
    }
}
