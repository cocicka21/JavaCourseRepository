package it.academy.course.hw7;

public class Home7Task_4 {
    public static void main(String[] args) {
        Rose roseR = new Rose("Rose", 7, "red", 7);
        Daisy daisyW = new Daisy("Daisy", 3, "white", 10);
        Peony peonyP = new Peony("Peony", 10, "pink", 8);
        double[] timeLife = {roseR.avgLifeTime, daisyW.avgLifeTime, peonyP.avgLifeTime};
        System.out.println("Bucket of flowers cost : " + Flowers.price + "$");
        System.out.println("Colors in the basket : " + Flowers.colors);
        System.out.println("A basket of flowers will wither through : " + getAvgTime(timeLife) + " days");
    }
    public static double getAvgTime(double[] timeLife){
        double avgTime = 0;
        for (double timeFlower : timeLife){
            if (timeFlower > avgTime) {
                avgTime = timeFlower;
            }
        }
        return avgTime;
    }
}
