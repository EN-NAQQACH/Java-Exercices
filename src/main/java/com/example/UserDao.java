package com.example;

import java.util.List;

public interface UserDao {

    void save(User user);
    User findById(int id);
    List<User> findAll();
    void update(User u);
    void delete (int id);

}
