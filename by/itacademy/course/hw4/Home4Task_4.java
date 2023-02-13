package by.itacademy.course.hw4;

import java.util.Random;

public class Home4Task_4 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        Random rnd = new Random();
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = -1;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(9);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        for (int j : myArray) {
            if (minNumber > j) {
                minNumber = j;
            }
            if (maxNumber < j) {
                maxNumber = j;
            }
        }
        System.out.print("Index with min value : ");
        for (int i = 0; i < myArray.length; i++){
            if (minNumber == myArray[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Index with max value : ");
        for (int i = 0; i < myArray.length; i++){
            if (maxNumber == myArray[i]){
                System.out.print(i + " ");
            }
        }
    }
}

