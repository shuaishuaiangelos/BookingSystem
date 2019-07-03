package cn.wss.bs.bll;

import cn.wss.bs.entity.Classroom;

import java.util.List;

public interface ClassroomBll {
    void addClassroom(Classroom classroom) throws Exception;
    void editClassroom(Classroom classroom) throws Exception;
    void removeClassroom(String id) throws Exception;
    Classroom getClassroom(String id) throws Exception;
    List<Classroom> getAllClassroom() throws Exception;
}
