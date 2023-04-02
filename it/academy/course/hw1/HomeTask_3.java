package it.academy.course.hw1;

import java.util.Scanner;

public class HomeTask_3 {
    public static void main(String[] args) {
        System.out.println("\nTask-3");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a period of time in seconds");
        int FullSec = in.nextInt();
        int weeks = FullSec / 604800;
        int days = FullSec / 86400 % 7;
        int hours = FullSec/ 3600 % 24;
        int minutes = FullSec/ 60 % 60;
        int seconds = FullSec % 60;
        System.out.printf("weeks = %s\ndays = %s\nhours = %s\nminutes = %s\nseconds = %s\n", weeks, days, hours, minutes, seconds);
    }
}
