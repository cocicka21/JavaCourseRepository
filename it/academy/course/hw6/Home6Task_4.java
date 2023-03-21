package it.academy.course.hw6;

public class Home6Task_4 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = createSomeString(3, 56);
        System.out.println(stringBuilder);
        changeStringBuilder(stringBuilder);
    }
    private static StringBuilder createSomeString(int a, int b){
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n")
              .append(a).append(" - ").append(b).append(" = ").append(a-b).append("\n")
              .append(a).append(" * ").append(b).append(" = ").append(a*b).append("\n");
        return result;
    }
    private static void changeStringBuilder(StringBuilder stringBuilder){
        int index;
        while ((index = stringBuilder.indexOf("=")) != -1){
            stringBuilder.deleteCharAt(index);
            stringBuilder.insert(index, "равно");
        }
        System.out.println(stringBuilder);
    }
}
