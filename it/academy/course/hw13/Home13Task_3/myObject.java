package it.academy.course.hw13.Home13Task_3;

public class myObject {
    private int value = 1;

    public synchronized void increment() {
        System.out.print(Thread.currentThread().getName() + " ");
        for (int i = 0; i < 100; i++) {
            System.out.print(value);

        }
        value++;
        System.out.println();
    }
}
