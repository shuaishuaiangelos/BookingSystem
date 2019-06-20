package cn.wss.bs.entity;

import java.util.Date;

public class CrBookingInfo {
    private int id;
    private String tbid;
    private String crid;
    private String usid;    //用户id
    private int state;  //是否通过预定
    private Date startTime; //占用开始时间
    private Date endTime;   //占用结束时间
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

    public String getUsid() {
        return usid;
    }

    public int getState() {
        return state;
    }

    public Date getStartTime() {
        return startTime;
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

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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
