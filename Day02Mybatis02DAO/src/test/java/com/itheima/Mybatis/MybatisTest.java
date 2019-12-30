package com.itheima.Mybatis;

import com.itheima.dao.IUserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author zack
 * @create 2019-12-31-1:43
 */
public class MybatisTest {
    private InputStream in;
    private IUserDao userDao;

    @Before
    public void init() throws IOException {
        //1去去配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 获取sqlsessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        userDao = new UserDaoImpl(factory);
    }

    @After
    public void destory() throws IOException {

        in.close();
    }

    @Test
    public void testFindAll() {
        //执行查询方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("mybatis saver");
        user.setAddress("浙江人和北京人");
        user.setSex("男");
        user.setBirthday(new Date());
        userDao.saveUser(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(50);
        user.setUsername("mybatis update");
        user.setAddress("浙江人");
        user.setSex("女");
        user.setBirthday(new Date());
        userDao.updateUser(user);
    }

    @Test
    public void deleteUpdate() {

        userDao.deleteUser(52);
    }

    @Test
    public void testFindOne() {
        User user = userDao.findById(53);
        System.out.println(user);
    }

    @Test
    public void testFindByName() {
        List<User> users = userDao.findByName("%王%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testfindTotal() {
        int total = userDao.findTotal();
        System.out.println(total);
    }



}
