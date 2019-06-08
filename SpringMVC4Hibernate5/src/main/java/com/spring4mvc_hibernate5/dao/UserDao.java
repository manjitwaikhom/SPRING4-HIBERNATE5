package com.spring4mvc_hibernate5.dao;

import java.util.List;

import com.spring4mvc_hibernate5.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
   User getUserById(int id);
}
