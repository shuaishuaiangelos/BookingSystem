package cn.wss.bs.bll.impl;

import cn.wss.bs.bll.UserBll;
import cn.wss.bs.dao.UserDao;
import cn.wss.bs.entity.User;

import java.util.List;

public class UserBllImpl implements UserBll {

    private UserDao userDao;

    public void addUser(User user) throws Exception {
        userDao.insertUser(user);
    }

    public void editUser(User user) throws Exception {
        userDao.updateUser(user);
    }

    public void removeUserById(String id) throws Exception {
        userDao.deleteUserById(id);
    }

    public User getUserById(String id) throws Exception {
        return userDao.findUserById(id);
    }

    public List<User> getAllUser() throws Exception {
        return userDao.getAllUsers();
    }
}