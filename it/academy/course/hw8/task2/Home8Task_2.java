package it.academy.course.hw8.task2;

public class Home8Task_2 {
    public static void main(String[] args) {
        User user = new User("Alex90", "RNDPASSword");
        User.Query query = user.new Query();
        query.printToLog();
    }
}
