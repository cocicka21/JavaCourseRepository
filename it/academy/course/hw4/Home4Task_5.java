package it.academy.course.hw4;

import java.util.Random;

public class Home4Task_5 {
    public static void main(String[] args) {
        int minNumber = Integer.MAX_VALUE;
        int[] myArray = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(9);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < myArray.length; i = i + 2) {
            if (minNumber > myArray[i]) {
                minNumber = myArray[i];
            }
        }
            System.out.print("Min value : ");
            for (int i = 1; i < myArray.length; i = i + 2) {
                if (minNumber == myArray[i]) {
                    System.out.print(minNumber + " ");
                }
            }

    }
}
