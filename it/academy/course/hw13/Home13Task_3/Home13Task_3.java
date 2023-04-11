package it.academy.course.hw13.Home13Task_3;

public class Home13Task_3 {
    public static void main(String[] args) {

        myObject myObject = new myObject();

        Thread thread1 = new Thread(myObject::increment);
        Thread thread2 = new Thread(myObject::increment);
        Thread thread3 = new Thread(myObject::increment);
        try {
            thread1.start();
            thread2.start();
            thread3.start();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
