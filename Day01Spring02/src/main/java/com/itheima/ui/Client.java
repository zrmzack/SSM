package com.itheima.ui;

import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;

/**
 * @author zack
 * @create 2019-12-30-5:46
 */
public class Client {
    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();
        IAccountService as =(IAccountService) BeanFactory.getBean("accountService");
        as.saveAccount();
    }
}
