package com.xxx.gateway.domain;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private String mobile;
    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public User(){}
    public User(String name){
        this.name = name;
        this.mobile = "";
        this.birth = new Date();
    }
}
