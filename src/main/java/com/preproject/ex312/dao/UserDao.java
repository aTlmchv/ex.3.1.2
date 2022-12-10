package com.preproject.ex312.dao;


import com.preproject.ex312.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    List <User> getAllUsers ();

    User getUserById(long id);

    void updateUserInfo(int id, User user);
}