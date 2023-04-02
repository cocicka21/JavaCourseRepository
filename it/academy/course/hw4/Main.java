package it.academy.course.hw4;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", "Smith", 25);
        john.say2();
        Person yanush = new Person("Yanush", "Petrovich", 31);
        yanush.say2();
        System.out.println(Person.counter);
    }
}
