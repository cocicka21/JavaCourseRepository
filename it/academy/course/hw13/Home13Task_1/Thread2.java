package it.academy.course.hw13.Home13Task_1;

public class Thread2 implements Runnable {
    public static Object getA() {
        return a;
    }

    private final static Object a = new Object();

    @Override
    public void run() {
        try {
            synchronized (a) {
                a.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
