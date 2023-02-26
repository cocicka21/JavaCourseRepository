package it.academy.course.hw7;

public class Kelvin {
    double k;

    public Kelvin(double k) {
        this.k = k;
    }

    public double convertK(){
        return k + 273.15;
    }
}
