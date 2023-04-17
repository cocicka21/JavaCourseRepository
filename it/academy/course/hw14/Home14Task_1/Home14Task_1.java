package it.academy.course.hw14.Home14Task_1;

import java.util.Scanner;

public class Home14Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time interval in seconds");
        int n = in.nextInt();
        ServiceThread st = new ServiceThread(n);
        st.start();
    }
}
