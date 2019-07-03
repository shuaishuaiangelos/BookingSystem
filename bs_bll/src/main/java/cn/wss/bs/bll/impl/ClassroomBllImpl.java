package cn.wss.bs.bll.impl;

import cn.wss.bs.bll.ClassroomBll;
import cn.wss.bs.dao.ClassroomDao;
import cn.wss.bs.entity.Classroom;

import java.util.List;

public class ClassroomBllImpl implements ClassroomBll {

    private ClassroomDao classroomDao;

    public void addClassroom(Classroom classroom) throws Exception {
        classroomDao.insertClassroom(classroom);
    }

    public void editClassroom(Classroom classroom) throws Exception {
        classroomDao.updateClassroom(classroom);
    }

    public void removeClassroom(String id) throws Exception {
        classroomDao.deleteClassroomById(id);
    }

    public Classroom getClassroom(String id) throws Exception {
        return classroomDao.findClassroomById(id);
    }

    public List<Classroom> getAllClassroom() throws Exception {
        return classroomDao.getAllClassroom();
    }
}
