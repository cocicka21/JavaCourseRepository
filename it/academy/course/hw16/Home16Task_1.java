package it.academy.course.hw16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Home16Task_1 {
    public static void main(String[] args) throws Exception {
        String login;
        String password;
        LocalDateTime dateStart;
        LocalDateTime dateEnd;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        while (true) {
            printMenu();
            int selectNumberMenu = Integer.parseInt(inputText());
            switch (selectNumberMenu) {
                case 1:
                    System.out.println("Enter login");
                    login = inputText();
                    System.out.println("Enter password");
                    password = inputText();
                    userService.checkUserByLoginAndPassword(login, password);
                    break;
                case 2:
                    System.out.println("Login to create a new account");
                    login = inputText();
                    System.out.println("Enter password");
                    password = inputText();
                    LocalDateTime registrationDate = LocalDateTime.now();
                    userService.createUser(login, password, registrationDate, registrationDate);
                    break;
                case 3:
                    System.out.println("Enter time period");
                    System.out.println("Format like : yyyy-MM-dd HH:mm\nStart");
                    dateStart = LocalDateTime.parse(inputText(), format);
                    System.out.println("End");
                    dateEnd = LocalDateTime.parse(inputText(), format);
                    List<User> users = userService.findUserForAPeriod(dateStart, dateEnd);
                    System.out.println(users);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Menu");
        System.out.println("Press 1 to LogIn;\nPress 2 to SignIn;\nPress 3 to print all users registered in a certain period of time;\nPress 4 to exit system;");
    }

    public static String inputText() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}