package by.itacademy.course.hw3;


import java.util.Arrays;

public class Home3Task_4 {
    public static void main(String[] args) {
        int a = 56;
        int b = 103;
        int c = 14;
        int[] myArray = new int[3];
        myArray[0] = a;
        myArray[1] = b;
        myArray[2] = c;
        Arrays.sort(myArray);
        for (int values : myArray) {
            System.out.print(values + ", ");
        }
    }
}
