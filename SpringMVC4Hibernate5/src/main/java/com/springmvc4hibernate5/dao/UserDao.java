package com.springmvc4hibernate5.dao;

import java.util.List;

import com.springmvc3hibernate5.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
