package it.academy.course.hw13.Home13Task_1;

import static java.lang.Thread.sleep;

public class Home13Task_1 {
    public static void main(String[] args) {
        try {
            Thread thread1 = new Thread(new Thread1());
            Thread thread2 = new Thread(new Thread2());
            System.out.println(thread1.getState() + " new");
            thread1.start();
            thread2.start();
            sleep(1000);
            System.out.println(thread1.getState() + " timed_waiting");
            System.out.println(thread2.getState() + " waiting");
            Object a = Thread2.getA();
            synchronized (a) {
                a.notify();
            }
            System.out.println(thread2.getState() + " blocked");
            sleep(1000);
            System.out.println(thread2.getState() + " terminated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
