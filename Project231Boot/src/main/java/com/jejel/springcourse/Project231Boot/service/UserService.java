package com.jejel.springcourse.Project231Boot.service;



import com.jejel.springcourse.Project231Boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers ();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}