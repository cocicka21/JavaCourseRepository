package it.academy.course.hw7.Home7Task_3;

public class Fruit {
    private double weight;
    private double costs;
    private double newWeight;

    public Fruit(double weight, double costs) {
        this.weight = weight;
        this.costs = costs;
    }

    public void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }

    public double costFruit() {
        newWeight = getNewWeight();
        costs = (newWeight * costs) / weight;
        System.out.println(costs + " for " + newWeight);
        return costs;
    }

    public void setWeight(double newWeight) {
        this.newWeight = newWeight;
    }

    public double getNewWeight (){
        return newWeight;
    }
}
