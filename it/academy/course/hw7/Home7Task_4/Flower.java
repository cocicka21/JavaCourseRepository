package it.academy.course.hw7.Home7Task_4;

public class Flower {
    private String flowerName;
    private double cost;
    private String color;
    private double avgLifeTime;
    private double price;

    public Flower(String flowerName, double cost, String color, double avgLifeTime) {
        this.flowerName = flowerName;
        this.cost = cost;
        this.color = color;
        this.avgLifeTime = avgLifeTime;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public double getAvgLifeTime() {
        return avgLifeTime;
    }

    public double getPrice() {
        return price;
    }
}
