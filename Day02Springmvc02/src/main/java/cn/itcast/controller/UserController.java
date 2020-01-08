package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.MalformedObjectNameException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zack
 * @create 2020-01-06-1:08
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("test执行了");
        //模拟数据库查询User对象
        User user = new User();
        user.setUsername("zrm");
        user.setPassword("123");
        user.setAge(20);
        //model对象
        model.addAttribute("user", user);

        return "success";
    }


    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("void执行了");
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
        return;
    }
    @RequestMapping("/testAjax")
    public void testAjax(@RequestBody String body) {
        System.out.println("testAjax");
        System.out.println(body);

    }
}
