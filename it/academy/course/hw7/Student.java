package it.academy.course.hw7;

public class Student {
    String firstName;
    String secondName;
    int course;
    String nameGroup;
    double averageRating;

    public Student(String firstName, String secondName, int course, String nameGroup, double averageRating) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.course = course;
        this.nameGroup = nameGroup;
        this.averageRating = averageRating;
    }
    public double scholarshipAmount(){
        return averageRating == 5 ? 100 : 80;
    }
}
