package it.academy.course.hw7.Home7Task_3;

public class Home7Task_3 {
    public static void main(String[] args) {
        Fruit apple = new Fruit(100, 100);
        Fruit pear = new Fruit(100, 140);
        Fruit apricot = new Fruit(100, 180);
        apple.setWeight(300);
        pear.setWeight(150);
        apricot.setWeight(210);
        double costs = apple.costFruit() + pear.costFruit() + apricot.costFruit();
        System.out.println("Basket of fruits costs : " + costs + " BYN");
    }
}
