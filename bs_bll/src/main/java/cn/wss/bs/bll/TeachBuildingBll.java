package cn.wss.bs.bll;

import cn.wss.bs.entity.TeachBuilding;

import java.util.List;

public interface TeachBuildingBll {
    void addTeachBuilding(TeachBuilding teachBuilding) throws Exception;
    void editTeachBuilding(TeachBuilding teachBuilding) throws Exception;
    void removeTeachBuildingById(String id) throws Exception;
    TeachBuilding getTeachBuildingById(String id) throws Exception;
    List<TeachBuilding> getAllTeachBuilding() throws Exception;
}