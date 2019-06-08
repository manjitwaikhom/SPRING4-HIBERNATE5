package com.spring4mvc_hibernate5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring4mvc_hibernate5.dao.UserDao;
import com.spring4mvc_hibernate5.model.User;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void save(User user) {
	userDao.save(user);
    }

    @Transactional(readOnly = true)
    public List<User> list() {
	return userDao.list();
    }

    @Override
    public User getById(int id) {
	return userDao.getUserById(id);
    }

}