package it.academy.course.hw7;

public class Aspirant extends Student{

    boolean scientificWork;

    public Aspirant(String firstName, String secondName, int course, String nameGroup, double averageRating, boolean scientificWork) {
        super(firstName, secondName, course, nameGroup, averageRating);
        this.scientificWork = scientificWork;
    }

    @Override
    public double scholarshipAmount() {
        return averageRating == 5 ? 200 : 180;
    }
}
