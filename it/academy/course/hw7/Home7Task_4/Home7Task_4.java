package it.academy.course.hw7.Home7Task_4;

public class Home7Task_4 {
    public static void main(String[] args) {
        Flower roseR = new Flower("Rose", 7, "red", 7);
        Flower daisyW = new Flower("Daisy", 3, "white", 10);
        Flower peonyP = new Flower("Peony", 10, "pink", 8);
        double[] costs = {roseR.getCost(), daisyW.getCost(), peonyP.getCost()};
        double[] timeLife = {roseR.getAvgLifeTime(), daisyW.getAvgLifeTime(), peonyP.getAvgLifeTime()};
        System.out.println("Bucket of flowers cost : " + calculateTheAmount(costs) + "$");
        System.out.println("Colors in the basket : " + Flower.getColors());
        System.out.println("A basket of flowers will wither through : " + getAvgTime(timeLife) + " days");
    }

    public static double getAvgTime(double[] timeLife) {
        double avgTime = 0;
        for (double timeFlower : timeLife) {
            if (timeFlower > avgTime) {
                avgTime = timeFlower;
            }
        }
        return avgTime;
    }

    public static double calculateTheAmount(double[] costs) {
        double costFlowers = 0;
        for (double cost : costs) {
            costFlowers += cost;
        }
        return costFlowers;
    }
}
