package cn.wss.bs.controller;

import cn.wss.bs.bll.SeatBll;
import cn.wss.bs.bll.impl.SeatBllImpl;
import cn.wss.bs.dao.SeatDao;
import cn.wss.bs.entity.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/seat")
public class SeatController {
    @Resource
    private SeatBll seatBllImlp;
//    @Autowired
//    private SeatDao sd;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Seat> findAllSeats(){
        List<Seat> seats = null;
        try {
            System.out.println("aaaaaa");
            seats = seatBllImlp.getAllSeats();
            System.out.println("bbbbbbb");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return seats;
    }
}
