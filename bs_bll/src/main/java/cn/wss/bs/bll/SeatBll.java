package cn.wss.bs.bll;

import cn.wss.bs.entity.Seat;

import java.util.List;

public interface SeatBll {
    void addSeat(Seat seat) throws Exception;
    void editSeat(Seat seat) throws Exception;
    void removeSeat(String id,String crid,String tbid) throws Exception;
    void removeSeatByTbId(String tbid) throws Exception;
    void removeSeatByCrId(String crid,String tbid) throws Exception;
    Seat getSeatAccurately(String id,String crid,String tbid) throws Exception;
    Seat getSeatAccuratelyWithState(String id,String crid,String tbid,int state) throws Exception;
    List<Seat> getAllSeats() throws Exception;
    List<Seat> getAllSeatsByTbId(String tbid) throws Exception;
    List<Seat> getAllSeatsByCrId(String crid,String tbid) throws Exception;
    List<Seat> getAllSeatsWithState(int state) throws Exception;
    List<Seat> getAllSeatsByTbIdWithState(String tbid,int state) throws Exception;
    List<Seat> getAllSeatsByCrIdWithState(String crid,String tbid,int state) throws Exception;
}
