package com.itheima.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zack
 * @create 2019-12-29-13:20
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private Date birthady;
    private String sex;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthady() {
        return birthady;
    }

    public void setBirthady(Date birthady) {
        this.birthady = birthady;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "domain{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthady=" + birthady +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
