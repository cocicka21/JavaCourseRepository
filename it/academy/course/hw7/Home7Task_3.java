package it.academy.course.hw7;

public class Home7Task_3 {
    public static void main(String[] args) {
        Fruit apple = new Apple(100, 100);
        Fruit pear = new Pear(100, 140);
        Fruit apricot = new Apricot(100, 180);
        apple.setWeight(300);
        pear.setWeight(150);
        apricot.setWeight(210);
        double costs = apple.costFruit() + pear.costFruit() + apricot.costFruit();
        System.out.println("Basket of fruits costs : " + costs + " BYN");
    }
}
