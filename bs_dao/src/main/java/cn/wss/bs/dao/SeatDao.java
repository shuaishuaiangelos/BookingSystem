package cn.wss.bs.dao;

import cn.wss.bs.entity.Seat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeatDao {
    Seat findSeatAccurately(@Param("id")String id, @Param("crid")String crid, @Param("tbid")String tbid) throws Exception; //查找某一具体座位
    Seat findSeatAccuratelyWithState(@Param("id")String id, @Param("crid")String crid, @Param("tbid")String tbid, @Param("state")int state) throws Exception; //查找某一具体状态座位
    void insertSeat(Seat seat) throws Exception;
    void deleteSeat(@Param("id")String id, @Param("crid")String crid, @Param("tbid")String tbid) throws Exception; //删除某一座位
    void deleteSeatByTbId(String tbid) throws Exception; //删除某一教学楼所有座位
    void deleteSeatByCrId(@Param("crid")String crid, @Param("tbid")String tbid) throws Exception; //删除某一教学楼某一教室所有座位
    void updateSeat(Seat seat) throws Exception;
    List<Seat> getAllSeats() throws Exception;
    List<Seat> getSeatsByTbId(String tbid) throws Exception; //返回某一教学楼所有座位
    List<Seat> getSeatsByCrId(@Param("crid")String crid, @Param("tbid")String tbid) throws Exception; //返回某一教学楼某一教室所有座位
    List<Seat> getSeatsWithState(int state) throws Exception;   //返回某一状态的所有座位
    List<Seat> getSeatsByTbIdWithState(@Param("tbid")String tbid, @Param("state")int state) throws Exception; //返回某一教学楼某一状态的所有座位
    List<Seat> getSeatsByCrIdWithState(@Param("crid")String crid, @Param("tbid")String tbid, @Param("state")int state) throws Exception; //返回某一教学楼某一教室某一状态的所有座位
}
