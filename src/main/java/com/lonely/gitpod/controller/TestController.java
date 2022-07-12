package com.lonely.gitpod.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2022-07-11 10:46
 * @author: ztkj-hzb
 * @description:
 **/
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {


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

}
