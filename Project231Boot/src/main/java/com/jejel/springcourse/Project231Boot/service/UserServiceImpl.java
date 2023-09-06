package com.jejel.springcourse.Project231Boot.service;

import com.jejel.springcourse.Project231Boot.dao.UserDAO;
import com.jejel.springcourse.Project231Boot.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public Object getUserById(long id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT)
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT)
    public void removeUser(long id) {
        userDAO.removeUser(id);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT)
    public void updateUser(@Valid User user) {
        userDAO.updateUser(user);
    }
}