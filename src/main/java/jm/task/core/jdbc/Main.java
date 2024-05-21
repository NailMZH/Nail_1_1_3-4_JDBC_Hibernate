package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 35);
        System.out.println("User с именем — Ivan добавлен в базу данных");
        userService.saveUser("Emily", "Johnson", (byte) 20);
        System.out.println("User с именем — Ivan добавлен в базу данных");
        userService.saveUser("Liam", "Wilson", (byte) 43);
        System.out.println("User с именем — Ivan добавлен в базу данных");
        userService.saveUser("Sergey", "Petrov", (byte) 18);
        System.out.println("User с именем — Ivan добавлен в базу данных");

        userService.getAllUsers();
        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
