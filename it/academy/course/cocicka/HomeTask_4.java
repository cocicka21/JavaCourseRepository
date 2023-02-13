package by.itacademy.course.cocicka;

import java.util.Scanner;

public class HomeTask_4 {
    public static void main(String[] args) {
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
        byte t = (byte) x;
        System.out.println("short to byte = " + t);
        return x;
    }
    static int IntConvert(int x){
        long q = (long) x;
        System.out.println("int to long = " + q);
        float w = (float) x;
        System.out.println("int to float = " + w);
        double e = (double) x;
        System.out.println("int to double = " + e);
        byte r = (byte) x;
        System.out.println("int to byte = " + r);
        short t = (short) x;
        System.out.println("int to short = " + t);
        char y = (char) x;
        System.out.println("int to char = " + y);
        return x;
    }
    static long LongConvert(long x){
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
}
