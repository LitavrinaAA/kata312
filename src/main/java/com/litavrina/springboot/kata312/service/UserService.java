package com.litavrina.springboot.kata312.service;

import com.litavrina.springboot.kata312.model.User;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    @Transactional
    void saveUser(User user);

    @Transactional
    User getUser(int id);


    @Transactional
    void deleteUser(int id);

}
