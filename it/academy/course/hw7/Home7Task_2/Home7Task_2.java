package it.academy.course.hw7.Home7Task_2;

public class Home7Task_2 {
    public static void main(String[] args) {
        double celsius = 42;
        System.out.println(celsius + " C");
        System.out.println(new Kelvin().conv(celsius));
        System.out.printf("%.3f F", new Fahrenheit().conv(celsius));
    }
}
