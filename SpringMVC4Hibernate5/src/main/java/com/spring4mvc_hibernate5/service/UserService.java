package com.spring4mvc_hibernate5.service;

import java.util.List;

import com.spring4mvc_hibernate5.model.User;

public interface UserService {
   void save(User user);
   List<User> list();
   User getById(int id);
}
