package cn.wss.bs.entity;

import java.util.Date;

public class Classroom {
    private String id;
    private String tbid; //教学楼id
    private int seatNum; //座位数量
    private String name;
    private String content;
    private int flag; //标志，用于区分教室和自习室
    private String str;
    private Date createTime;
    private Date updateTime;

    public Classroom(){}

    public Classroom(String id,String tbid,int setNum,String name,String content,int flag,String str,Date createTime,Date updateTime){
        this.id=id;
        this.tbid=tbid;
        this.seatNum=setNum;
        this.name=name;
        this.content=content;
        this.flag=flag;
        this.str=str;
        this.createTime=createTime;
        this.updateTime=updateTime;
    }

    public Classroom(String id,String tbid,int setNum,String name,String content,int flag,String str){
        this.id=id;
        this.tbid=tbid;
        this.seatNum=setNum;
        this.name=name;
        this.content=content;
        this.flag=flag;
        this.str=str;
    }

    public String getId() {
        return id;
    }

    public String getTbid() {
        return tbid;
    }

    public int getSetNum() {
        return seatNum;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getFlag() {
        return flag;
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

    public void setTbid(String tbid) {
        this.tbid = tbid;
    }

    public void setSetNum(int setNum) {
        this.seatNum = setNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFlag(int flag) {
        this.flag = flag;
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
