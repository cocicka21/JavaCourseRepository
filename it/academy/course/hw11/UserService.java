package it.academy.course.hw11;

import java.util.regex.Pattern;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void loginMatch(String login) throws WrongLoginException {
        String regex = "^[a-zA-Z0-9_]{5,20}$";
        boolean isValid = Pattern.matches(regex, login);
        if (!isValid)
            throw new WrongLoginException("Login does not meet requirements");
    }

    public void passwordMatch(String password) throws WrongPasswordException {
        String regex = "^[a-zA-Z0-9_]{8,}$";
        boolean isValid = Pattern.matches(regex, password);
        if (!isValid)
            throw new WrongPasswordException("Password does not meet requirements");
    }

    public void checkUserNotExist(String login) throws UserNotExistException {
        if (userRepository.existsUserByLogin(login)) {
            throw new UserNotExistException("User not exist with login :" + login);
        }
    }

    public void checkUserByLoginAndPassword(String login, String password) throws UserNotExistException {
        if (!(userRepository.existsUserByLoginAndPassword(login, password))) {
            throw new UserNotExistException("User not found");
        }
    }

    public void createUser(String login, String password) throws Exception {
        loginMatch(login);
        checkUserNotExist(login);
        passwordMatch(password);

        User user = new User(login, password);
        userRepository.saveUser(user);
    }

}
