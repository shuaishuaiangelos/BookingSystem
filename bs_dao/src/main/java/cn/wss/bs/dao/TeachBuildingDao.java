package cn.wss.bs.dao;

import cn.wss.bs.entity.TeachBuilding;
import java.util.List;

public interface TeachBuildingDao {
    TeachBuilding findTeachBuildingById(String id) throws Exception;
    void insertTeachBuilding(TeachBuilding teachBuilding) throws Exception;
    void deleteTeachBuildingById(String id) throws Exception;
    void updateTeachBuilding(TeachBuilding teachBuilding) throws Exception;
    List<TeachBuilding> getAllTeachBuilding() throws Exception;
    void insertTeachBuildings(List<TeachBuilding> list) throws Exception;
}