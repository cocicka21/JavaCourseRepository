package it.academy.course.hw14.Home14Task_2;

public class Philosopher extends Thread {
    private final int id;
    private final Object leftFork;
    private final Object rightFork;

    public Philosopher(int id, Object leftFork, Object rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Philosopher " + id + " is thinking.");
                Thread.sleep((int) (Math.random() * 1000));

                System.out.println("Philosopher " + id + " is grabbing forks.");
                synchronized (leftFork) {
                    synchronized (rightFork) {
                        System.out.println("Philosopher " + id + " is eating.");
                        Thread.sleep((int) (Math.random() * 1000));
                        return;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
