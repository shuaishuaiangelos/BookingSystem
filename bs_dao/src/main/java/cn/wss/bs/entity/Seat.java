package cn.wss.bs.entity;

import java.util.Date;

public class Seat {
    private String id;
    private String crid;    //教室编号
    private String tbid;    //教学楼编号
    private String content;
    private int state; //状态：已预定、已占用、空闲
    private String str;
    private Date createTime;
    private Date updateTime;

    public Seat(){}

    public Seat(String id,String crid,String tbid,String content,int state,String str,Date createTime,Date updateTime){
        this.id=id;
        this.crid=crid;
        this.tbid=tbid;
        this.content=content;
        this.state=state;
        this.str=str;
        this.createTime=createTime;
        this.updateTime=updateTime;
    }

    public Seat(String id,String crid,String tbid,String content,int state,String str){
        this.id=id;
        this.crid=crid;
        this.tbid=tbid;
        this.content=content;
        this.state=state;
        this.str=str;
    }

    public String getId() {
        return id;
    }

    public String getCrid() {
        return crid;
    }

    public String getTbid() {
        return tbid;
    }

    public String getContent() {
        return content;
    }

    public int getState() {
        return state;
    }

    public String getStr() {
        return str;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCrid(String crid) {
        this.crid = crid;
    }

    public void setTbid(String tbid) {
        this.tbid = tbid;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
