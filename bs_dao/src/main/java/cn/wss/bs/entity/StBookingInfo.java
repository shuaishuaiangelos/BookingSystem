package cn.wss.bs.entity;

import java.util.Date;

public class StBookingInfo {
    private int id;
    private String tbid;
    private String crid;
    private String stid;
    private String usid;
    private int state;  //用户主动结束可设置state
    private Date bookingTime;   //预定时间
    private Date confirmTime;   //确认占用时间
    private Date endTime;   //结束时间
    private Date createTime;    //创建时间
    private Date updateTime;    //更新时间

    public StBookingInfo(){}

    public StBookingInfo(int id,String tbid,String crid,String stid,String usid,int state,Date bookingTime,Date confirmTime,Date endTime,Date createTime,Date updateTime){
        this.id=id;
        this.tbid=tbid;
        this.crid=crid;
        this.stid=stid;
        this.usid=usid;
        this.state=state;
        this.bookingTime=bookingTime;
        this.confirmTime=confirmTime;
        this.endTime=endTime;
        this.createTime=createTime;
        this.updateTime=updateTime;
    }

    public StBookingInfo(int id,String tbid,String crid,String stid,String usid,int state,Date bookingTime,Date confirmTime,Date endTime){
        this.id=id;
        this.tbid=tbid;
        this.crid=crid;
        this.stid=stid;
        this.usid=usid;
        this.state=state;
        this.bookingTime=bookingTime;
        this.confirmTime=confirmTime;
        this.endTime=endTime;
    }

    public StBookingInfo(int id,String tbid,String crid,String stid,String usid,int state){
        this.id=id;
        this.tbid=tbid;
        this.crid=crid;
        this.stid=stid;
        this.usid=usid;
        this.state=state;
    }

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

    public Date getBookingTime() {
        return bookingTime;
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

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
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