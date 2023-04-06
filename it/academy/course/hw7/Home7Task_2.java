package it.academy.course.hw7;

public class Home7Task_2 {
    public static void main(String[] args) {
        double celsius = 42;
        System.out.println(celsius + " C");
        Kelvin kelvin = new Kelvin(celsius);
        System.out.println(kelvin.convertK() + " K");
        Fahrenheit fahrenheit = new Fahrenheit(celsius);
        System.out.printf("%.3f F",fahrenheit.convertF());
    }
}
