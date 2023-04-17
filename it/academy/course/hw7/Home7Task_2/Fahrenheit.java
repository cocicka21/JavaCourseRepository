package it.academy.course.hw7.Home7Task_2;

public class Fahrenheit implements TemperatureConversion {

    @Override
    public double conv(double celsius) {
        return (celsius * 1.8) + 32;
    }
}
