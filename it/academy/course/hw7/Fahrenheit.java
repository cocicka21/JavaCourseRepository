package it.academy.course.hw7;

public class Fahrenheit {
    double f;

    public Fahrenheit(double f) {
        this.f = f;
    }

    public double convertF(){
        return (f * 1.8) + 32;
    }

}
