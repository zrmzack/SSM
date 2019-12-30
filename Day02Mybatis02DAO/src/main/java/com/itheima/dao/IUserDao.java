package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author zack
 * @create 2019-12-31-1:40
 */
public interface IUserDao {
    List<User> findAll();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);

    User findById(Integer id);

    List<User> findByName(String username);

    int findTotal();

   // List<User> findUserByVo(QueryVo vo);
}
