package cn.wss.bs.entity;

import java.util.Date;

public class TeachBuiding {
    private String id;
    private String name;
    private String content;  //备注
    private String str; //二维码字符串
    private Date createTime;
    private Date updateTime;

    public TeachBuiding(){}

    public TeachBuiding(String id,String name,String content,String str,Date createTime,Date updateTime){
        this.id=id;
        this.name=name;
        this.content=content;
        this.str=str;
        this.createTime=createTime;
        this.updateTime=updateTime;
    }

    public TeachBuiding(String id,String name,String content,String str){
        this.id=id;
        this.name=name;
        this.content=content;
        this.str=str;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCotent() {
        return content;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
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