package it.academy.course.hw7.Home7Task_1;

public class Home7Task_1 {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Jitter", 4, "IIT", 5);
        Aspirant igor = new Aspirant("Igor", "Jdanov", 5, "IDT", 3.6, true);
        Student jenya = new Aspirant("Jenya", "Usachev", 6, "PGS", 4.5, true);
        Student[] database = {ivan, igor, jenya};
        printStudents(database);

    }
    public static void printStudents(Student[] database){
        for (Student student : database) {
            System.out.println(student.getFirstName() + " "
                    + student.getSecondName() + " "
                    + student.getCourse() + " "
                    + student.getNameGroup() + " "
                    + student.getAverageRating() + " "
                    + student.getScholarshipAmount());
        }
    }
}
