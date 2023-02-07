package it.academy.course.cocicka;

import java.util.Scanner;

public class HomeTask_2 {
    public static void main(String[] args) {
        System.out.println("\nTask-2");
        Scanner in = new Scanner(System.in);
        System.out.println("Input first integer number");
        int FirstInteger = in.nextInt();
        System.out.println("Input second integer number");
        int SecondInteger = in.nextInt();
        System.out.println(resulthw2(FirstInteger, SecondInteger));
    }
    static int resulthw2(int x, int y){
        return (x + y) + (x * y);
    }
}
