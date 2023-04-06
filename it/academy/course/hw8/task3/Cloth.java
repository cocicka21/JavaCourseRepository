package it.academy.course.hw8.task3;

public class Cloth {
    String name;
    SizeCloth size;
    String color;

    public Cloth(String name, SizeCloth size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "name : " + name + " size : " + size + " color : " + color;
    }
}
