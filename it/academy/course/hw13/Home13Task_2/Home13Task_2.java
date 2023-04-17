package it.academy.course.hw13.Home13Task_2;

import java.util.Scanner;

public class Home13Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arrayNumbers = new int[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = in.nextInt();
        }
        ThreadMax threadMax = new ThreadMax(arrayNumbers);
        ThreadMin threadMin = new ThreadMin(arrayNumbers);
        threadMax.start();
        threadMin.start();
        try {
            threadMax.join();
            threadMin.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println("Max value : " + threadMax.getMaximum());
        System.out.println("Min value : " + threadMin.getMinimum());
    }
}

