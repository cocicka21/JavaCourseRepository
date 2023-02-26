package it.academy.course.hw7;

public class Apple extends Fruit{
    double cost;

    public Apple(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    @Override
    public double costFruit() {
        cost = weight;
        System.out.println(cost + " BYN for " + weight + "g apples");
        return cost;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
