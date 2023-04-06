package it.academy.course.hw7;

public class Fruit {
    double weight;
    double cost;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public void printManufacturerInfo(){
        System.out.print("Made in Belarus");
    }
    public double costFruit(){
        cost = weight;
        System.out.println(cost + " for " + weight);
        return cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
