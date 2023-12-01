package com.litavrina.springboot.kata312.service;

import com.litavrina.springboot.kata312.dao.UserDao;
import com.litavrina.springboot.kata312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }


    @Override
    @Transactional
    public void deleteUser(int id) {
        System.out.println("Сервис" + id);
        userDao.delUser(id);
    }


}
