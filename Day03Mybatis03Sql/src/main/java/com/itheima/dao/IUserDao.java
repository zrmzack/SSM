package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;

import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * <p>
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> findAll();


    /**
     * 根据id查询用户信息
     *
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 根据名称模糊查询用户信息
     *
     * @param username
     * @return
     */
    List<User> findByName(String username);


    /**
     * 根据queryVo中的条件查询用户
     *
     * @param vo
     * @return
     */
    List<User> findUserByVo(QueryVo vo);

    List<User> findUserByCondition(User user);
    List<User> findUserInIds(QueryVo queryVo);
}
