package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author zack
 * @create 2019-12-31-4:49
 */
public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<User> findAll() {
        //1。根据factory获取sqlsession对象
        SqlSession session = factory.openSession();
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findAll");
        session.close();
        return users;
    }

    @Override
    public void saveUser(User user) {
        SqlSession session = factory.openSession();
        session.insert("com.itheima.dao.IUserDao.saveUser");
        session.commit();
        session.close();
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Integer id) {

    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findByName(String username) {
        return null;
    }

    @Override
    public int findTotal() {
        return 0;
    }
}
