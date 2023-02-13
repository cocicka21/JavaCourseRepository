package by.itacademy.course.hw3;

public class Home3Task_1 {
    public static void main(String[] args) {

        int intnumb = 50;
        Integer IntNumb = 45;
        intnumb = IntNumb;  //автораспаковка
        IntNumb = intnumb * 10; //автоупаковка
        System.out.println("Result of auto unpacking = " + intnumb);
        System.out.println("Result of autopacking = " + IntNumb);

    }
}
