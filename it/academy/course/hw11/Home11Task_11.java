package it.academy.course.hw11;

import java.util.Scanner;

public class Home11Task_11 {
    public static void main(String[] args) throws Exception {
        String login;
        String password;
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
                    userService.createUser(login, password);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Menu");
        System.out.println("Press 1 to LogIn;\nPress 2 to SignIn;\nPress 3 to exit system");
    }

    public static String inputText() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
