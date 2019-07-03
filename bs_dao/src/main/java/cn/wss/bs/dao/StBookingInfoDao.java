package cn.wss.bs.dao;

import cn.wss.bs.entity.StBookingInfo;

import java.util.List;

public interface StBookingInfoDao {
    void insertStBookingInfo(StBookingInfo user) throws Exception;
    void updateStBookingInfo(StBookingInfo user) throws Exception;
    List<StBookingInfo> getAllStBookingInfo() throws Exception;
}
