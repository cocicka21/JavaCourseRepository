package by.itacademy.course.cocicka;

public class HomeTask_1 {
    public static void main(String[] args) {
        System.out.println("Task-1");
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char q = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        System.out.printf("b = %d\ns = %d\ni = %d\nl = %d\nq = %c\nf = %2f\nd = %8f\nbool = %s\n", b, s, i, l, q, f, d, bool);
    }
}
