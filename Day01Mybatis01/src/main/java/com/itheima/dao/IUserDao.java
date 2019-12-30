package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author zack
 * @create 2019-12-29-13:26
 */
public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
