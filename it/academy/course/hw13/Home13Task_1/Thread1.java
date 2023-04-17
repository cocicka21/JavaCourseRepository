package it.academy.course.hw13.Home13Task_1;

import static java.lang.Thread.sleep;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState() + " runnable");
        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
