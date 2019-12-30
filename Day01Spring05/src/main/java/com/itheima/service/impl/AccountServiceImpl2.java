package com.itheima.service.impl;

import com.itheima.service.IAccountService;

import java.util.Date;

/**
 * @author zack
 * @create 2019-12-30-5:36
 */

/**
 * 业务层实现类
 */
public class AccountServiceImpl2 implements IAccountService {

    private String name;
    private Integer age;
    private Date birthday;



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println("service 中得saveAccount执行了" + name + "," + age + "," + birthday);
    }


}
