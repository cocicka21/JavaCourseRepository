package it.academy.course.hw5;

public class Home5Task_2 {
    public static void main(String[] args) {
        Phone firstPerson = new Phone(489032752, "Nokia", 530);
        Phone secondPerson = new Phone(432423582, "Motorola");
        Phone operator = new Phone();
        firstPerson.receiveCall("Viktor");
        secondPerson.receiveCall("Katya", secondPerson.number);
        operator.sendMessage(firstPerson.number, secondPerson.number);
        System.out.println();
        System.out.println("Caller number : " + firstPerson.getNumber());
    }
}
