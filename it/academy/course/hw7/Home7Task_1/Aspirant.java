package it.academy.course.hw7.Home7Task_1;

public class Aspirant extends Student {

    private boolean scientificWork;

    public Aspirant(String firstName,
                    String secondName,
                    int course,
                    String nameGroup,
                    double averageRating,
                    boolean scientificWork) {
        super(firstName, secondName, course, nameGroup, averageRating);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarshipAmount() {
        return getAverageRating() == 5 ? 200 : 180;
    }
}
