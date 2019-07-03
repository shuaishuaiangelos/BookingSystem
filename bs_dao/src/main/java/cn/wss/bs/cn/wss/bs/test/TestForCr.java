package cn.wss.bs.cn.wss.bs.test;

import cn.wss.bs.dao.CrBookingInfoDao;
import cn.wss.bs.entity.CrBookingInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TestForCr {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        CrBookingInfoDao cbd = (CrBookingInfoDao) applicationContext.getBean("crBookingInfoDao");
        Date date = new Date();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.DAY_OF_YEAR, 1);//日期加1天
        Date date2 = rightNow.getTime();
        CrBookingInfo sbi = new CrBookingInfo("1", "1", "S201761137", 0, date, date2);
        rightNow.add(Calendar.DAY_OF_YEAR, 1);//日期加1天
        Date date3 = rightNow.getTime();
        CrBookingInfo sbi2 = new CrBookingInfo("1", "1", "S201761137", 0, date2, date3);
        try{
            cbd.insertCrBookingInfo(sbi);
            cbd.insertCrBookingInfo(sbi2);
            List<CrBookingInfo> lists = cbd.getAllCrBookingInfo();
            for(CrBookingInfo cc : lists){
                System.out.println(cc.getId()+","+cc.getTbid()+","+cc.getCrid()+","+cc.getUsid()+","+cc.getState()+","+cc.getStartTime()+","+cc.getEndTime());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}