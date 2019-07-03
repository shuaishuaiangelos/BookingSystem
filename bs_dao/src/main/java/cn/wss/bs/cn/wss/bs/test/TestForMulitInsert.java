package cn.wss.bs.cn.wss.bs.test;

import cn.wss.bs.dao.ClassroomDao;
import cn.wss.bs.dao.SeatDao;
import cn.wss.bs.dao.TeachBuildingDao;
import cn.wss.bs.dao.UserDao;
import cn.wss.bs.entity.Classroom;
import cn.wss.bs.entity.Seat;
import cn.wss.bs.entity.TeachBuilding;
import cn.wss.bs.entity.User;
import cn.wss.bs.tools.CSVResolver;
import com.csvreader.CsvReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestForMulitInsert {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
//        TeachBuildingDao cbd = (TeachBuildingDao) applicationContext.getBean("teachBuildingDao");
//        List<TeachBuilding> list = CSVResolver.getTeachingBuildings("E:\\study\\our\\TeachBuilding.csv",',', "UTF-8");
//        UserDao ud = (UserDao)applicationContext.getBean("userDao");
//        List<User> users = CSVResolver.getUsers("E:\\study\\our\\User.csv",',', "UTF-8");
//        ClassroomDao cd = (ClassroomDao)applicationContext.getBean("classroomDao");
//        List<Classroom> classrooms = CSVResolver.getClassrooms("E:\\study\\our\\Classroom.csv",',', "UTF-8");
        SeatDao sd = (SeatDao)applicationContext.getBean("seatDao");
        List<Seat> seats = CSVResolver.getSeats("E:\\study\\our\\Seat.csv",',', "UTF-8");
        try{
//            cbd.insertTeachBuildings(list);
//            List<TeachBuilding> list1 = cbd.getAllTeachBuilding();
//            for(TeachBuilding cc : list1){
//                System.out.println(cc.getId()+","+cc.getName()+","+cc.getCotent()+","+cc.getStr());
//            }
//            ud.insertUsers(users);
//            users = ud.getAllUsers();
//            for(User user : users){
//                System.out.println(user.getId()+","+user.getName()+","+user.getPaddword()+","+user.getAuthority());
//            }
//            cd.insertClassrooms(classrooms);
//            classrooms = cd.getAllClassroom();
//            for(Classroom classroom : classrooms){
//                System.out.println(classroom.getId()+","+classroom.getTbid()+","+classroom.getName()+","+classroom.getStr()+","+classroom.getContent()+","+classroom.getSetNum()+","+classroom.getFlag());
//            }
            sd.insertSeats(seats);
            seats = sd.getAllSeats();
            for(Seat seat : seats){
                System.out.println(seat.getId()+","+seat.getCrid()+","+seat.getTbid()+","+seat.getStr()+","+seat.getContent()+","+seat.getState());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
