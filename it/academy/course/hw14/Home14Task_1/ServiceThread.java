package it.academy.course.hw14.Home14Task_1;

import java.util.Date;

public class ServiceThread extends Thread {
    int n;

    public ServiceThread(int n) {
        this.n = n;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(new Date());
            try {
                Thread.sleep(n * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
