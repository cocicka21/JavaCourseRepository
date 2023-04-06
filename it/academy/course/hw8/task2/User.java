package it.academy.course.hw8.task2;

public class User {
    String login;
    String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        public void printToLog() {
            System.out.println("User : " + login + " Password : " + password + " Sent request");
        }
    }
}
