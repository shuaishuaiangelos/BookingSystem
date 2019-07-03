package cn.wss.bs.bll;

import cn.wss.bs.entity.User;

import java.util.List;

public interface UserBll {
    void addUser(User user) throws Exception;
    void editUser(User user) throws Exception;
    void removeUserById(String id) throws Exception;
    User getUserById(String id) throws Exception;
    List<User> getAllUser() throws Exception;
}