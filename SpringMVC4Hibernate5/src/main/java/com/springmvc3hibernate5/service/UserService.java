package com.springmvc3hibernate5.service;

import java.util.List;

import com.springmvc3hibernate5.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
