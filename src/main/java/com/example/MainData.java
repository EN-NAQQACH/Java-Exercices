package com.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainData {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Data.xml");
        UserDao userDao = (UserDao) context.getBean("jdbcUserDao");

        User newUser = new User();
        newUser.setUsername("Mohssine");
        newUser.setEmail("Mohssineennaqqach0@gmail.com");

        userDao.save(newUser);
        System.out.println("User saved: " + newUser);
    
       /*  // Fetch and display the user by Id
        User fetchedUser = userDao.findById(4);
        System.out.println("User fetched by ID: " + fetchedUser);

        // Fetch and display all users
        List<User> allUsers = userDao.findAll();
        System.out.println("All Users: " + allUsers);

        // Update the user
        fetchedUser.setUsername("mohammedamine");
        fetchedUser.setEmail("mohamedamine@example.com");
        userDao.update(fetchedUser);

        // Fetch and display the updated user
        User updatedUser = userDao.findById(fetchedUser.getId());
        System.out.println("Updated User: " + updatedUser);

        // Delete the user
        userDao.delete(updatedUser.getId());

        // Fetch and display all users after deletion
        List<User> remainingUsers = userDao.findAll();
        System.out.println("Remaining Users: " + remainingUsers); */

    }
}
