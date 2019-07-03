package cn.wss.bs.bll.impl;

import cn.wss.bs.bll.TeachBuildingBll;
import cn.wss.bs.dao.TeachBuildingDao;
import cn.wss.bs.entity.TeachBuilding;

import java.util.List;

public class TeachBuildingBllImpl implements TeachBuildingBll {

    private TeachBuildingDao teachBuildingDao;

    public void addTeachBuilding(TeachBuilding teachBuilding) throws Exception {
        teachBuildingDao.insertTeachBuilding(teachBuilding);
    }

    public void editTeachBuilding(TeachBuilding teachBuilding) throws Exception {
        teachBuildingDao.updateTeachBuilding(teachBuilding);
    }

    public void removeTeachBuildingById(String id) throws Exception {
        teachBuildingDao.deleteTeachBuildingById(id);
    }

    public TeachBuilding getTeachBuildingById(String id) throws Exception {
        return teachBuildingDao.findTeachBuildingById(id);
    }

    public List<TeachBuilding> getAllTeachBuilding() throws Exception {
        return teachBuildingDao.getAllTeachBuilding();
    }
}