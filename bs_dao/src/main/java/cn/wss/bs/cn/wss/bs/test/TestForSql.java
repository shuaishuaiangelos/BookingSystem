package cn.wss.bs.cn.wss.bs.test;

import cn.wss.bs.dao.ClassroomDao;
import cn.wss.bs.dao.TeachBuildingDao;
import cn.wss.bs.dao.UserDao;
import cn.wss.bs.entity.Classroom;
import cn.wss.bs.entity.TeachBuilding;
import cn.wss.bs.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestForSql {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserDao ud = (UserDao)applicationContext.getBean("userDao");
        User user = new User("S201761392", "wss", "wss", 1);
        User user1=new User("S201761137", "xss", "xss", 1);
        ClassroomDao cd=(ClassroomDao)applicationContext.getBean("classroomDao");
        Classroom classroom = new Classroom("1","1",30,"人工智能","深度学习",1,"11111111");
        TeachBuildingDao tbd = (TeachBuildingDao)applicationContext.getBean("teachBuildingDao");
        TeachBuilding teachBuilding = new TeachBuilding("2","信息楼","信息学部","1111");
        try {
            //ud.insertUser(user1);
            //ud.updateUser(user);
            //cd.insertClassroom(classroom);
            //tbd.insertTeachBuilding(teachBuilding);
            TeachBuilding teachBuilding1=tbd.findTeachBuildingById("2");
            System.out.println(teachBuilding1.getId()+" "+teachBuilding1.getName());
//            User user1 = ud.findUserById("S201761392");
//            System.out.println(user1.getId() + " " + user1.getName());
//            List<User> users = ud.getAllUsers();
//            for(User us : users){
//                System.out.println(us.getId() + " " + us.getName());
//            }
//            List<Classroom> classrooms = cd.getAllClassroom();
//            for(Classroom crd : classrooms){
//                System.out.println(crd.getId() + " " + crd.getName());
//            }
            System.out.println("succeed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}