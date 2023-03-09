package it.academy.course.hw5;

public class Person {

        String fullName;
        int age;

        public Person(){}

        public Person(String name, int yearsOld){
            fullName = name;
            age = yearsOld;
        }

        public void moving(){
            System.out.println(fullName + " Talking");
        }
        public void talk(){
            System.out.println(fullName + " Talking");
        }
    }
