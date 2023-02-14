package it.academy.course.hw4;

import java.util.Scanner;

public class Home4Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();
        System.out.println("Factorial of your number = " + getFactorial(number));
    }
    public static int getFactorial(int x){
        int total = 1;
        for (int i = 1; i <=x; i++){
            total = total *i;
        }
        return total;
    }
}
