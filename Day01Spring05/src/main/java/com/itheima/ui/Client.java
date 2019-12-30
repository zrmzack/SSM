package com.itheima.ui;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zack
 * @create 2019-12-30-5:46
 */
public class Client {

    /**
     * 获取spring得IOC核心容器，并根据id获取对象
     *
     * @param args
     */
    public static void main(String[] args) {
        //1.huoqu核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据ID 获取bean对象
//        IAccountService as = (IAccountService) ac.getBean("accountService", IAccountService.class);
//       IAccountService as = (IAccountService) ac.getBean("accountService2", IAccountService.class);
       IAccountService as = (IAccountService) ac.getBean("accountService3", IAccountService.class);
        as.saveAccount();
        ((ClassPathXmlApplicationContext) ac).close();
    }
}
