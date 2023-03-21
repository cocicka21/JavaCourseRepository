package it.academy.course.hw7.Home7Task_3;

public class Pear extends Fruit {

    public Pear(double weight, double costs) {
        super(weight, costs);
    }

    @Override
    public double costFruit() {
        this.costs = weight * 1.4;
        System.out.println(this.costs + " BYN for " + weight + "g pears");
        return this.costs;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
