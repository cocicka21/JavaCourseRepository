package it.academy.course.hw7;

public class Apricot extends Fruit {
    double cost;

    public Apricot(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    @Override
    public double costFruit() {
        cost = weight * 1.8;
        System.out.println(cost + " BYN for " + weight + "g apricots");
        return cost;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
