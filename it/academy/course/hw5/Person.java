package it.academy.course.hw5;

public class Person {

        String fullName;
        int age;

        public Person(){}

        public Person(String name, int yearsOld){
            fullName = name;
            age = yearsOld;
        }

        public void move(){
            System.out.println(fullName + " Moving");
        }
        public void talk(){
            System.out.println(fullName + " Talking");
        }
    }
