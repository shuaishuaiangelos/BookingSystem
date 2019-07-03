package cn.wss.bs.cn.wss.bs.test;


import cn.wss.bs.dao.ClassroomDao;
import cn.wss.bs.dao.StBookingInfoDao;
import cn.wss.bs.dao.TeachBuildingDao;

import cn.wss.bs.dao.UserDao;
import cn.wss.bs.entity.Classroom;
import cn.wss.bs.entity.StBookingInfo;
import cn.wss.bs.entity.TeachBuilding;
import cn.wss.bs.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

public class TestForSql {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");

        //UserDao ud = (UserDao)applicationContext.getBean("userDao");
        //User user = new User("S201761392", "wss", "wss", 1);
        //User user = new User("S201761392", "wss", "wss", 1);
        //TeachBuidingDao tbd = (TeachBuidingDao)applicationContext.getBean("teachBuidingDao");
        //TeachBuiding tb = new TeachBuiding("002", "知行楼", "综合","002composite");
        //SeatDao sd = (SeatDao)applicationContext.getBean("seatDao");
        //Seat st = new Seat("003","002","001","",1,"002002001S");
        StBookingInfoDao sibd = (StBookingInfoDao)applicationContext.getBean("stBookingInfoDao");
        Date date = new Date();
        StBookingInfo sbi = new StBookingInfo("001","002","001","S201761137",0,date,date);

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

//            for(User user : users){
//                System.out.println(user.getId() + " " + user.getName());
//            }
            //tbd.deleteTeachBuidingById("002");
//            tbd.updateTeachBuiding(tb);
//            List<TeachBuiding> TeachBuidings = tbd.getAllTeachBuiding();
//            for(TeachBuiding teachBuiding : TeachBuidings){
//                System.out.println(teachBuiding.getId() + " " + teachBuiding.getName());
//            }
//            System.out.println();
//            TeachBuiding ttt = tbd.findTeachBuidingById("001");
//            System.out.println(ttt.getId()+","+ttt.getName()+","+ttt.getCotent()+","+ttt.getStr());
            //sd.insertSeat(st);
//            List<Seat> seats = sd.getSeatsByCrIdWithState("001","002",1);
//            for(Seat ss : seats){
//                System.out.println(ss.getId() + " " + ss.getStr());
//            }
//            Seat seat = sd.findSeatAccurately("003","22","2");
//            if(seat==null){
//                System.out.println("null");
//            }
            //sibd.insertStBookingInfo(sbi);
            List<StBookingInfo> StBookingInfos = sibd.getAllStBookingInfo();
            for(StBookingInfo ss : StBookingInfos){
                System.out.println(ss.getId() + " " + ss.getTbid() + " " + ss.getCrid() + " "+ ss.getStid() + " "+ss.getUsid()+" "+ss.getBookingTime());
            }

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