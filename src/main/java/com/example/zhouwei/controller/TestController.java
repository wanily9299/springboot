package com.example.zhouwei.controller;

import com.example.zhouwei.User;
import com.example.zhouwei.config.ar.SessionUser;
import com.example.zhouwei.service.TestService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhouwei on 2017/4/2.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("/users")
    @ResponseBody
    public List<User> findAll() {
        List<User> users = Lists.newArrayList(
                new User("张三"),
                new User("李四"),
                new User("王五")
        );
        return users;
    }

    @RequestMapping("/toIndex")
    public String  index() {
        return "test/index";
    }

    @RequestMapping("/utf")
    @ResponseBody
    public String utf() {
        return "你我他";
    }

    @RequestMapping("/session")
    @ResponseBody
    public User session(@SessionUser User user) {
        return user;
    }

    @Autowired
    TestService testService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(@SessionUser User user) {
        List<User> all = testService.findAll();
        return all;
    }

}
