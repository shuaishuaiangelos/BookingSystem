package cn.wss.bs.dao;

import cn.wss.bs.entity.CrBookingInfo;

import java.util.List;

public interface CrBookingInfoDao {
    void insertCrBookingInfo(CrBookingInfo user) throws Exception;
    void updateCrBookingInfo(CrBookingInfo user) throws Exception;
    List<CrBookingInfo> getAllCrBookingInfo() throws Exception;
}
