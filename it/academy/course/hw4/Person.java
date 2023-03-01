package it.academy.course.hw4;

public class Person {
    String firstName;
    String secondName;
    int age;
    static int counter = 0;

    public Person(String name, String familia, int vozrast) {
        firstName = name;
        secondName = familia;
        age = vozrast;
        counter++;
    }
    public static void say(){
        System.out.println("HAHAHAHAHAH");
        System.out.println(counter);
//        this.firstName
    }
    public void say2(){
        System.out.println("HAHAHAHAHAHHAHAHAHAHAH123");
        System.out.println(firstName + secondName + age);
    }
    public static void puckpuck(){
        System.out.println("HAHAHAHAHAHHAHAHAHAHAH123");
    }

}
