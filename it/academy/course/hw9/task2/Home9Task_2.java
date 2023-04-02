package it.academy.course.hw9.task2;

public class Home9Task_2 {
    public static void main(String[] args) {
        String first = "Hello";
        Integer second = 3125423;
        Pair<Integer, String> pair = new Pair<>(second, first);
        System.out.println(pair.getFirst() + " " + pair.getSecond());
        pair.setSecond("Goodbye");
        pair.setFirst(5);
        System.out.println(pair.getFirst() + " " + pair.getSecond());
        Pair<String, Integer> pair1 = pair.swap();
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
    }
}
