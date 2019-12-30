package com.itheima.Mybatis;

import com.itheima.dao.IUserDao;
import com.itheima.domain.QueryVo;
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
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before
    public void init() throws IOException {
        //1去去配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 获取sqlsessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //获取sqlsession对象
        sqlSession = factory.openSession();
        //获取dao的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);
    }

    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
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
        user.setUserName("mybatis saver");
        user.setUserAddress("浙江人和北京人");
        user.setUserSex("男");
        user.setUserBirthday(new Date());
        userDao.saveUser(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setUserId(50);
        user.setUserName("mybatis update");
        user.setUserAddress("浙江人");
        user.setUserSex("女");
        user.setUserBirthday(new Date());
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

    @Test
    public void testFindByQueryVo() {
        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setUserName("%王%");
        queryVo.setUser(user);
        List<User> users = userDao.findUserByVo(queryVo);
        for (User u : users) {
            System.out.println(u);
        }
    }

}
