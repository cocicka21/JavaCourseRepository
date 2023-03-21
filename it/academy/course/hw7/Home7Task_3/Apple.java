package it.academy.course.hw7.Home7Task_3;

public class Apple extends Fruit {


    public Apple(double weight, double costs) {
        super(weight, costs);
    }

    @Override
    public double costFruit() {
        this.costs = weight;
        System.out.println(this.costs + " BYN for " + weight + "g apples");
        return this.costs;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
