package com.itheima.factory;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;

/**
 * @author zack
 * @create 2019-12-30-22:24
 */
public class StaticFactory {
    public static  IAccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
