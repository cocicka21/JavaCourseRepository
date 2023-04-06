package it.academy.course.hw1;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        hw1();
        hw2(args);
        hw3(args);
        hw4(args);
        hw5(args);
    }

    public static void hw1() {
        System.out.println("Task-1");
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char q = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        System.out.printf("b = %d\ns = %d\ni = %d\nl = %d\nq = %c\nf = %2f\nd = %8f\nbool = %s\n", b, s, i, l, q, f, d, bool);
    }

    public static void hw2(String[] args) {
        System.out.println("\nTask-2");
        Scanner in = new Scanner(System.in);
        System.out.println("Input first integer number");
        int FirstInteger = in.nextInt();
        System.out.println("Input second integer number");
        int SecondInteger = in.nextInt();
        System.out.println(resulthw2(FirstInteger, SecondInteger));
    }
    static int resulthw2(int x, int y){
        return (x + y) + (x * y);
    }

    public static void hw3(String[] args){
        System.out.println("\nTask-3");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a period of time in seconds");
        int FullSec = in.nextInt();
        int weeks = FullSec / 604800;
        int days = FullSec / 86400 % 7;
        int hours = FullSec/ 3600 % 24;
        int minutes = FullSec/ 60 % 60;
        int seconds = FullSec % 60;
        System.out.printf("weeks = %s\ndays = %s\nhours = %s\nminutes = %s\nseconds = %s\n", weeks, days, hours, minutes, seconds);
    }
    public static void hw4(String[] args) {
        System.out.println("\nTask-4");
        byte b = 12;
        ByteConvert(b);

        short s = 121;
        ShortConvert(s);

        int i = 1212;
        IntConvert(i);

        long l = 121212L;
        LongConvert(l);

        float f = 1.21f;
        FloatConvert(f);

        double d = 1.2121;

        char c = 'a';
        CharConvert(c);
    }

        static byte ByteConvert(byte x){
            short q = (short) x;
            System.out.println("byte to short = " + q);
            int w = (int) x;
            System.out.println("byte to int = " + w);
            long e = (long) x;
            System.out.println("byte to long = " + e);
            return x;
        }
        static short ShortConvert(short x){
                int q = (int) x;
                System.out.println("short to int = " + q);
                long w = (long) x;
                System.out.println("short to long = " + w);
                float e = (float) x;
                System.out.println("short to float = " + e);
                double r = (double) x;
                System.out.println("short to double = " + r);
                return x;
            }
        static int IntConvert(int x){
                long q = (long) x;
                System.out.println("int to long = " + q);
                float w = (float) x;
                System.out.println("int to float = " + w);
                double e = (double) x;
                System.out.println("int to double = " + e);
                return x;
            }
        static long LongConvert(long x){
                float q = (float) x;
                System.out.println("long to float = " + q);
                double w = (double) x;
                System.out.println("long to double = " + w);
                return x;
            }
        static char CharConvert(char x){
                int q = (int) x;
                System.out.println("char to int = " + q);
                return x;
            }
        static float FloatConvert(float x){
                double q = (double) x;
                System.out.println("float to double = " + q);
                return x;
            }

    public static void hw5(String[] args){
        System.out.println("\nTask-5");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any number");
        int ReNumber = in.nextInt();
        if (ReNumber > 0 && ReNumber % 2 == 0) {
            System.out.println("0");
        } else if (ReNumber > 0 && ReNumber % 2 != 0) {
            System.out.println(ReNumber%2);
        }
        else {
            System.out.println("Number is 0 or less than 0");
        }

    }
}