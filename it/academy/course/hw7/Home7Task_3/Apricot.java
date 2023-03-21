package it.academy.course.hw7.Home7Task_3;

public class Apricot extends Fruit {

    public Apricot(double weight, double costs) {
        super(weight, costs);
    }

    @Override
    public double costFruit() {
        this.costs = weight * 1.8;
        System.out.println(this.costs + " BYN for " + weight + "g apricots");
        return this.costs;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
