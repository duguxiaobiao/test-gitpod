package com.lonely.gitpod.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.lonely.gitpod.entity.User;
import com.lonely.gitpod.service.UserService;
import com.lonely.gitpod.utils.RedisUtil;
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

    @Autowired
    private RedisUtil redisUtil;

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


    /**
     * 验证集成redis
     * @return
     */
    @GetMapping("/test4")
    public List<User> test4() {

        Object obj = this.redisUtil.get("KEY_USERS");
        if (obj != null) {
            log.info("走Redis缓存");
            return JSON.parseObject((String) obj, new TypeReference<List<User>>() {
            });
        }

        List<User> users = this.userService.selectUsers();
        this.redisUtil.set("KEY_USERS", JSON.toJSONString(users));

        return users;
    }

}
