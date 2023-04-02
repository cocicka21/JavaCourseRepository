package it.academy.course.hw8.task1;

public class Home8Task_1 {
    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Cooking with " + str);
            }
        };
        food.prepare(cookable, "pan");
    }
}
