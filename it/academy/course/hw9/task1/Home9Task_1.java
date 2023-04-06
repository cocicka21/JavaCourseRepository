package it.academy.course.hw9.task1;

public class Home9Task_1 {
    public static void main(String[] args) {
        Integer firstNumber = 15;
        Double secondNumber = 11.3;
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);
        double sum = Calculator.sum(firstNumber, secondNumber);
        System.out.println("Sum = " + sum);
        double multiply = Calculator.multiply(firstNumber, secondNumber);
        System.out.println("Multiply = " + multiply);
        double divide = Calculator.divide(firstNumber, secondNumber);
        System.out.println("Divide = " + divide);
        double subtraction = Calculator.subtraction(firstNumber, secondNumber);
        System.out.println("Subtraction = " + subtraction);
    }
}
