package com.itheima.service.impl;

import com.itheima.service.IAccountService;

/**
 * @author zack
 * @create 2019-12-30-5:36
 */

/**
 * 业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    @Override
    public void saveAccount() {
        System.out.println("service 中得saveAccount执行了");
    }

    public void init() {
        System.out.println("对象初始化了");
    }

    public void destory() {
        System.out.println("对象销毁了");
    }
}
