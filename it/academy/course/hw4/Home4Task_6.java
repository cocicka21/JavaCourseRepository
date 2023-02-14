package it.academy.course.hw4;

import java.util.Random;

public class Home4Task_6 {
    public static void main(String[] args) {
        int pos = 0;
        int neg = 0;
        int[] myArray = new int[10];

        Random rnd = new Random();
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = rnd.nextInt(20) - 10;
            System.out.print(myArray[i] + " ");
        }
        for (int i : myArray){
            if (i >= 0){
                pos++;
            } else {
                neg++;
            }
        }

        int[] arrayPos = new int[pos];
        int[] arrayNeg = new int[neg];

        int currentPos = 0;
        int currentNeg = 0;
        for (int i : myArray){
            if (i >= 0) {
                arrayPos[currentPos] = i;
                currentPos++;
            } else {
                arrayNeg[currentNeg] = i;
                currentNeg++;
            }
        }
        System.out.println();
        System.out.print("Array with negative numbers : ");
        for (int i : arrayNeg) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Array with positive numbers : ");
        for (int i : arrayPos) {
            System.out.print(i + " ");
        }
    }
}
