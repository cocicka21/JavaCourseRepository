package it.academy.course.hw3;

import java.util.Random;

public class Home3Task_8 {
    public static void main(String[] args){
        Random rnd = new Random();
        int WorkDaySec = rnd.nextInt(28800);
        int WorkDayHour = WorkDaySec / 3600;
        System.out.println("Seconds left until the end of the day " + WorkDaySec);
        switch (WorkDayHour) {
            case 0: System.out.println("Less than an hour left");
            case 1: System.out.println(WorkDayHour + " hour left");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: System.out.println(WorkDayHour + " hours left");
            default: System.out.println(WorkDayHour + " hours left");
        }
    }
}
