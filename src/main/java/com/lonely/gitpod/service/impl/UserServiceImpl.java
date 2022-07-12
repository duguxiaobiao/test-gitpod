package com.lonely.gitpod.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lonely.gitpod.dao.UserDao;
import com.lonely.gitpod.entity.User;
import com.lonely.gitpod.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date: 2022-07-12 19:13
 * @author: ztkj-hzb
 * @description:
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    /**
     * 查询用户信息
     *
     * @return
     */
    @Override
    public List<User> selectUsers() {
        return super.list();
    }
}
