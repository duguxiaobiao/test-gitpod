package com.lonely.gitpod.controller;

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
public class TestController {


    @GetMapping("/test1")
    public String test1(){
        return "test1";
    }


}
