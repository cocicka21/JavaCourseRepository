package it.academy.course.hw7;

public class Rose extends Flowers{
    Rose(String flowerName, double cost, String color, double avgLifeTime){
        this.flowerName = flowerName;
        this.cost = cost;
        this.color = color;
        this.avgLifeTime = avgLifeTime;
        price += cost;
        colors +=color + " ";
    }
}
