package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(UserDTO userDTO);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUser(long id);

    User findByUsername(String name);

    void updateUser(long id, UserDTO user);

    void saveRole(Role role);

    void assignRoleToUser(User user, Role role);

}
