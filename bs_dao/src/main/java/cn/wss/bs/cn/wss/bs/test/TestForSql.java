package cn.wss.bs.cn.wss.bs.test;

import cn.wss.bs.dao.UserDao;
import cn.wss.bs.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestForSql {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserDao ud = (UserDao)applicationContext.getBean("userDao");
        //User user = new User("S201761392", "wss", "wss", 1);
        //User user = new User("S201761392", "wss", "wss", 1);
        try {
            //ud.updateUser(user);
//            User user1 = ud.findUserById("S201761392");
//            System.out.println(user1.getId() + " " + user1.getName());
            List<User> users = ud.getAllUsers();
            for(User user : users){
                System.out.println(user.getId() + " " + user.getName());
            }
            System.out.println("succeed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
