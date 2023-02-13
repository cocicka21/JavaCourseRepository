package by.itacademy.course.hw4;

import java.util.Scanner;

public class Home4Task_2 {

    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.println("First number");
        int firstNumber = in.nextInt();
        System.out.println("Second number");
        int secondNumber = in.nextInt();
        int sum = firstNumber + secondNumber;
        int multi = firstNumber * secondNumber;
        System.out.println("sum = " + sum + "\nmultiplication = " + multi);
    }
}
