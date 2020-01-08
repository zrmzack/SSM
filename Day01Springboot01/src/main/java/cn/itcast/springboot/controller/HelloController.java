package cn.itcast.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zack
 * @create 2020-01-03-1:21
 */
@RestController
@RequestMapping("hello")
@EnableAutoConfiguration
public class HelloController {
    @GetMapping("show")
    public String test() {
        return "hello springboot 1";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
