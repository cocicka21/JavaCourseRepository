package it.academy.course.hw7.Home7Task_1;

public class Student {
    private String firstName;
    private String secondName;
    private int course;
    private String nameGroup;
    private double averageRating;

    public Student(String firstName, String secondName, int course, String nameGroup, double averageRating) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.course = course;
        this.nameGroup = nameGroup;
        this.averageRating = averageRating;
    }

    public double getScholarshipAmount() {
        return averageRating == 5 ? 100 : 80;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getCourse() {
        return course;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public double getAverageRating() {
        return averageRating;
    }
}
