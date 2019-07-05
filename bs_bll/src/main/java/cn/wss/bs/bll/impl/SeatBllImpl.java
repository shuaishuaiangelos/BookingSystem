package cn.wss.bs.bll.impl;

import cn.wss.bs.bll.SeatBll;
import cn.wss.bs.dao.SeatDao;
import cn.wss.bs.entity.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("seatBllImlp")
public class SeatBllImpl implements SeatBll {

    @Autowired
    private SeatDao seatDao;

    public void addSeat(Seat seat) throws Exception {
        seatDao.insertSeat(seat);
    }

    public void editSeat(Seat seat) throws Exception {
        seatDao.updateSeat(seat);
    }

    public void removeSeat(String id,String crid,String tbid) throws Exception {
        seatDao.deleteSeat(id, crid, tbid);
    }

    public void removeSeatByTbId(String tbid) throws Exception {
        seatDao.deleteSeatByTbId(tbid);
    }

    public void removeSeatByCrId(String crid,String tbid) throws Exception {
        seatDao.deleteSeatByCrId(crid,tbid);
    }

    public Seat getSeatAccurately(String id, String crid, String tbid) throws Exception {
        return seatDao.findSeatAccurately(id, crid, tbid);
    }

    public Seat getSeatAccuratelyWithState(String id, String crid, String tbid, int state) throws Exception {
        return seatDao.findSeatAccuratelyWithState(id, crid, tbid, state);
    }

    public List<Seat> getAllSeats() throws Exception {
        return seatDao.getAllSeats();
    }

    public List<Seat> getAllSeatsByTbId(String tbid) throws Exception {
        return seatDao.getSeatsByTbId(tbid);
    }

    public List<Seat> getAllSeatsByCrId(String crid, String tbid) throws Exception {
        return seatDao.getSeatsByCrId(crid, tbid);
    }

    public List<Seat> getAllSeatsWithState(int state) throws Exception {
        return seatDao.getSeatsWithState(state);
    }

    public List<Seat> getAllSeatsByTbIdWithState(String tbid, int state) throws Exception {
        return seatDao.getSeatsByTbIdWithState(tbid, state);
    }

    public List<Seat> getAllSeatsByCrIdWithState(String crid, String tbid, int state) throws Exception {
        return seatDao.getSeatsByCrIdWithState(crid, tbid, state);
    }
}