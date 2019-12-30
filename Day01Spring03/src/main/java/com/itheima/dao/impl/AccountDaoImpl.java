package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;

/**
 * @author zack
 * @create 2019-12-30-5:42
 */

/**
 * 账户持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
