package cn.wss.bs.entity;

import java.util.Date;

public class User {
    private String id;
    private String name;
    private String password;
    private int authority;  //权力级别
    private Date createTime;
    private Date updateTime;

    public User(){}

    public User(String id,String name,int authorit,Date createTime,Date updateTime){
        this.id=id;
        this.name=name;
        this.authority=authorit;
        this.createTime=createTime;
        this.updateTime=updateTime;
    }

    public User(String id,String name,int authorit){
        this.id=id;
        this.name=name;
        this.authority=authorit;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPaddword() {
        return password;
    }

    public int getAuthority() {
        return authority;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    //    public User(int id,String name,String paddword,int authority,Date createTime,Date updateTim){
//        this.authority=
//    }
}
