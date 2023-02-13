package by.itacademy.course.cocicka;

import java.util.Scanner;

public class HomeTask_5 {
    public static void main(String[] args) {
        System.out.println("\nTask-5");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any number");
        int ReNumber = in.nextInt();
        if (ReNumber > 0 && ReNumber % 2 == 0) {
            System.out.println("0");
        } else if (ReNumber > 0 && ReNumber % 2 != 0) {
            System.out.println(ReNumber % 2);
        } else {
            System.out.println("Number is 0 or less than 0");
        }
    }
}
