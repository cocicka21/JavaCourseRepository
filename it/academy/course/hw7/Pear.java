package it.academy.course.hw7;

public class Pear extends Fruit{
    double cost;

    public Pear(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    @Override
    public double costFruit() {
        cost = weight * 1.4;
        System.out.println(cost + " BYN for " + weight + "g pears");
        return cost;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
