package it.academy.course.hw5;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {}

    public void receiveCall(String name) {
        System.out.println("Calling : " + name);
    }

    public int getNumber() {
        return this.number;
    }
    public void sendMessage (int ...number){
        System.out.println("Sending messages to : ");
        for (int n : number) {
            System.out.print(n + " ");
        }
    }
    public void receiveCall(String name, int number){
        System.out.println("Calling : " + name + " : " + number);
    }
}
