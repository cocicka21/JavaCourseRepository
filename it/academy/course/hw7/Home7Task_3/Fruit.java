package it.academy.course.hw7.Home7Task_3;

public class Fruit {
    double weight;
    double costs;

    public Fruit(double weight, double costs) {
        this.weight = weight;
        this.costs = costs;
    }

    public void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }

    public double costFruit() {
        costs = weight;
        System.out.println(costs + " for " + weight);
        return costs;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
