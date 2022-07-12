package com.lonely.gitpod.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lonely.gitpod.entity.User;

import java.util.List;

/**
 * @date: 2022-07-12 19:12
 * @author: ztkj-hzb
 * @description:
 **/
public interface UserService extends IService<User> {

    /**
     * 查询用户信息
     * @return
     */
    List<User> selectUsers();

}
