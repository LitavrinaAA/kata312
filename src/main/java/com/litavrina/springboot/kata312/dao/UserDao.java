package com.litavrina.springboot.kata312.dao;

import com.litavrina.springboot.kata312.model.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);


    void delUser(int id);
}
