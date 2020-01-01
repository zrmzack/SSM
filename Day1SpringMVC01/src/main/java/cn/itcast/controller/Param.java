package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zack
 * @create 2020-01-01-6:11
 */
@Controller
@RequestMapping("param")
public class Param {
    @RequestMapping("testparam")
    public String testparm(String username,String password) {
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

    @RequestMapping("saveAccount")
    public String saveAccount(Account account) {
        System.out.println(account);
        return "success";
    }
}
