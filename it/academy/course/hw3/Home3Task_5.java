package it.academy.course.hw3;

import java.util.Scanner;

public class Home3Task_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number 0-59");
        int number = in.nextInt();

        if(number >= 0 && number <= 14){
            System.out.println("In the first quarter");
        }
        else if(number >= 15 && number <= 30){
            System.out.println("In the second quarter");
        }
        else if(number >= 31 && number <= 45){
            System.out.println("In the third quarter");
        }
        else if (number >= 46 && number <= 59){
            System.out.println("In the fourth quarter");
        }
        else {System.out.println("Invalid range");}
    }
}
