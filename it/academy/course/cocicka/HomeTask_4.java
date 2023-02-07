package it.academy.course.cocicka;

import java.util.Scanner;

public class HomeTask_4 {
    public static void main(String[] args) {
        System.out.println("\nTask-4");
        byte b = 12;
        byteConvert(b);

        short s = 121;
        shortConvert(s);

        int i = 1212;
        intConvert(i);

        long l = 121212L;
        longConvert(l);

        float f = 1.21f;
        floatConvert(f);

        double d = 1.2121;

        char c = 'a';
        charConvert(c);
    }

    static byte byteConvert(byte x){
        short q = x;
        System.out.println("byte to short = " + q);
        int w = x;
        System.out.println("byte to int = " + w);
        long e = x;
        System.out.println("byte to long = " + e);
        return x;
    }
    static short shortConvert(short x){
        int q = x;
        System.out.println("short to int = " + q);
        long w = x;
        System.out.println("short to long = " + w);
        float e = x;
        System.out.println("short to float = " + e);
        double r = x;
        System.out.println("short to double = " + r);
        byte t = (byte) x;
        System.out.println("short to byte = " + t);
        return x;
    }
    static int intConvert(int x){
        long q = x;
        System.out.println("int to long = " + q);
        float w = (float) x;
        System.out.println("int to float = " + w);
        double e = x;
        System.out.println("int to double = " + e);
        byte r = (byte) x;
        System.out.println("int to byte = " + r);
        short t = (short) x;
        System.out.println("int to short = " + t);
        char y = (char) x;
        System.out.println("int to char = " + y);
        return x;
    }
    static long longConvert(long x){
        float q = (float) x;
        System.out.println("long to float = " + q);
        double w = (double) x;
        System.out.println("long to double = " + w);
        byte e = (byte) x;
        System.out.println("long to short = " + e);
        short r = (short) x;
        System.out.println("long to short = " + r);
        int t = (int) x;
        System.out.println("long to int = " + t);
        return x;
    }
    static char charConvert(char x){
        int q = x;
        System.out.println("char to int = " + q);
        return x;
    }
    static float floatConvert(float x){
        double q = x;
        System.out.println("float to double = " + q);
        return x;
    }
}
