package it.academy.course.hw3;

import java.util.Random;

public class Home3Task_8 {
    public static void main(String[] args){
        Random rnd = new Random();
        int workDaySec = rnd.nextInt(28800);
        int workDayHour = workDaySec / 3600;
        System.out.println("Seconds left until the end of the day " + workDaySec);
        switch (workDayHour) {
            case 0: System.out.println("Less than an hour left");
            case 1: System.out.println(workDayHour + " hour left");
            case 2, 3, 4, 5, 6, 7, 8: System.out.println(workDayHour + " hours left");
            default: System.out.println(workDayHour + " hours left");
        }
    }
}
