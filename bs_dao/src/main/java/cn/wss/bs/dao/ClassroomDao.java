package cn.wss.bs.dao;

import cn.wss.bs.entity.Classroom;

import java.util.List;

public interface ClassroomDao {
    Classroom findClassroomById(String id) throws Exception;
    void insertClassroom(Classroom classroom) throws Exception;
    void deleteClassroomById(String id) throws Exception;
    void updateClassroom(Classroom classroom) throws Exception;
    List<Classroom> getAllClassroom() throws Exception;
}