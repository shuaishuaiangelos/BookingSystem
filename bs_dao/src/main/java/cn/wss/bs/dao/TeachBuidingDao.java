package cn.wss.bs.dao;

import cn.wss.bs.entity.TeachBuiding;
import java.util.List;

public interface TeachBuidingDao {
    TeachBuiding findUserById(String id) throws Exception;
    void insertTeachBuiding(TeachBuiding user) throws Exception;
    void deleteTeachBuidingById(String id) throws Exception;
    void updateTeachBuiding(TeachBuiding user) throws Exception;
    List<TeachBuiding> getAllTeachBuiding() throws Exception;
}
