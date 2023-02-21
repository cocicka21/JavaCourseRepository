package it.academy.course.hw4;

import java.util.Random;

public class Home4Task_7 {
    public static void main(String[] args) {
        int lengthArr = 9;
        int[] myArray = new int[lengthArr];

        Random rnd = new Random();
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = rnd.nextInt(200) - 100;
            System.out.print(myArray[i] + " ");
        }
        for (int i = 0; i < lengthArr/2; i++ ) {
            int j = myArray[i];
            myArray[i] = myArray[lengthArr - 1 - i];
            myArray[lengthArr - 1 - i] = j;
        }
        System.out.println();
        System.out.print("Inverted array : ");
        for (int j : myArray) {
            System.out.print(j + " ");
        }
    }
}
