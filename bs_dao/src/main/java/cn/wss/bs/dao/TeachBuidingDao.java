package cn.wss.bs.dao;

import cn.wss.bs.entity.TeachBuilding;
import java.util.List;

public interface TeachBuidingDao {
    TeachBuilding findTeachBuildingById(String id) throws Exception;
    void insertTeachBuilding(TeachBuilding user) throws Exception;
    void deleteTeachBuildingById(String id) throws Exception;
    void updateTeachBuilding(TeachBuilding user) throws Exception;
    List<TeachBuilding> getAllTeachBuilding() throws Exception;
}
