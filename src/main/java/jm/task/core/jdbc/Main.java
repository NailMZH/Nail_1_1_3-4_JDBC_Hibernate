package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();

        userService.saveUser("Ivan", "Ivanov", (byte) 35);
        userService.saveUser("Emily", "Johnson", (byte) 20);
        userService.saveUser("Liam", "Wilson", (byte) 43);
        userService.saveUser("Sergey", "Petrov", (byte) 18);

        userService.getAllUsers();
        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
