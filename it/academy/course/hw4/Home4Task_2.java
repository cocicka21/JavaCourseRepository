package it.academy.course.hw4;

import java.util.Scanner;

public class Home4Task_2 {

    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int numb = in.nextInt();
        int sum = 0;
        int multi = 1;
        while (numb > 0){
            sum += numb % 10;
            multi *= numb % 10;
            numb = numb / 10;
        }
        System.out.println(sum);
        System.out.println(multi);

    }
}
