package it.academy.course.hw16;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
        if (userRepository.existsUserByLoginAndPassword(login, password)) {
            LocalDateTime lastAuthorizationDate = LocalDateTime.now();
            User user = userRepository.getUser(login, password);
            user.setLastAuthorizationDate(lastAuthorizationDate);
        } else {
            throw new UserNotExistException("User not found");
        }
    }

    public void createUser(String login, String password, LocalDateTime registrationDate, LocalDateTime lastAuthorizationDate) throws Exception {
        loginMatch(login);
        checkUserNotExist(login);
        passwordMatch(password);
        User user = new User(login, password, registrationDate, lastAuthorizationDate);
        userRepository.saveUser(user);
    }

    public List<User> findUserForAPeriod(LocalDateTime dateStart, LocalDateTime dateEnd) {
        List<User> applyUsers = new ArrayList<>();
        List<User> users = userRepository.getUsers();
        for (User user : users) {
            if (user.getRegistrationDate().isAfter(dateStart) && user.getRegistrationDate().isBefore(dateEnd)) {
                applyUsers.add(user);
            }
        }
        return applyUsers;
    }
}