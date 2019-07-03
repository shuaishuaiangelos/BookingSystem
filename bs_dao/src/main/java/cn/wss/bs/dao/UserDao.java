package cn.wss.bs.dao;
import cn.wss.bs.entity.User;

import java.util.List;

public interface UserDao {
    User findUserById(String id) throws Exception;
    void insertUser(User user) throws Exception;
    void deleteUserById(String id) throws Exception;
    void updateUser(User user) throws Exception;
    List<User> getAllUsers() throws Exception;
}