package by.itacademy.course.hw3;

import java.util.Scanner;

public class Home3Task_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sides of the triangles one by one");
        System.out.println("Enter the first side");
        int a = in.nextInt();
        System.out.println("Enter the second side");
        int b = in.nextInt();
        System.out.println("Enter the thrd side");
        int c = in.nextInt();
        if ((a < b + c) && (b < a + c) && (c < a + b)){
            System.out.println("The triangle can exist");
        }
        else {System.out.println("The triangle can't exist");}
    }
}
