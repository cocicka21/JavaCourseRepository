package it.academy.course.hw7;

public class Home7Task_1 {
    public static void main(String[] args) {
        Student Ivan = new Student("Ivan",  "Jitter", 4, "IIT", 5);
        Aspirant Igor = new Aspirant("Igor", "Jdanov", 5, "IDT", 3.6, true);
        Student Jenya = new Aspirant("Jenya", "Usachev", 6, "PGS", 4.5, true );
        Student[] database = {Ivan, Igor, Jenya};
        for (Student student : database){
            System.out.println(student.firstName + " " + student.secondName + " " + student.course + " " + student.nameGroup + " " + student.averageRating + " " + student.scholarshipAmount());
        }
    }
}
