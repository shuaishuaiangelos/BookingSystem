package cn.wss.bs.entity;

import java.util.Date;

public class StBookingInfo {
    private int id;
    private String tbid;
    private String crid;
    private String stid;
    private String usid;
    private int state;  //用户主动结束可设置state
    private Date bookingTimr;   //预定时间
    private Date confirmTime;   //确认占用时间
    private Date endTime;   //结束时间
    private Date createTime;    //创建时间
    private Date updateTime;    //更新时间

    public int getId() {
        return id;
    }

    public String getTbid() {
        return tbid;
    }

    public String getCrid() {
        return crid;
    }

    public String getStid() {
        return stid;
    }

    public String getUsid() {
        return usid;
    }

    public int getState() {
        return state;
    }

    public Date getBookingTimr() {
        return bookingTimr;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTbid(String tbid) {
        this.tbid = tbid;
    }

    public void setCrid(String crid) {
        this.crid = crid;
    }

    public void setStid(String stid) {
        this.stid = stid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setBookingTimr(Date bookingTimr) {
        this.bookingTimr = bookingTimr;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
