package it.academy.course.hw14.Home14Task_2;

public class Home14Task_2 {
    private static final int NUM_PHILOSOPHERS = 5;
    private static final Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];
    private static final Object[] forks = new Object[NUM_PHILOSOPHERS];

    public static void main(String[] args) {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % NUM_PHILOSOPHERS]);
            philosophers[i].start();
        }
    }
}
