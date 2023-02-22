package it.academy.course.hw6;

public class Home6Task_4 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = createSomeString(3, 56);
        System.out.println(stringBuilder);
    }
    private static StringBuilder createSomeString(int a, int b){
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" равно ").append(a+b).append("\n")
              .append(a).append(" - ").append(b).append(" равно ").append(a-b).append("\n")
              .append(a).append(" * ").append(b).append(" равно ").append(a*b).append("\n");
        return result;
    }
}
