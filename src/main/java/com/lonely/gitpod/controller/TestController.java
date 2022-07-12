package com.lonely.gitpod.controller;

import com.lonely.gitpod.entity.User;
import com.lonely.gitpod.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @date: 2022-07-11 10:46
 * @author: ztkj-hzb
 * @description:
 **/
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    /**
     * 输出日志，测试 gitpod集成插件功能
     *
     * @return
     */
    @GetMapping("/test2")
    public String test2() {
        log.info("调用了test2()");
        return "test2";
    }

    /**
     * 查询用户集合
     *
     * @return
     */
    @GetMapping("/test3")
    public List<User> test3() {
        log.info("调用了test3()");
        return this.userService.selectUsers();
    }


}
