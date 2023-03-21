package it.academy.course.hw7.Home7Task_2;

public class Kelvin implements TemperatureConversion {

    @Override
    public double conv(double celsius) {
        return celsius + 273.15;
    }
}
