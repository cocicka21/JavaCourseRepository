package it.academy.course.hw10.task3;

public class Home10Task_3 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.max()); // Output: 3
        stack.pop();
        stack.pop();
        System.out.println(stack.max()); // Output: 1
        stack.push(5);
        stack.push(4);
        System.out.println(stack.max()); // Output: 5
    }
}
