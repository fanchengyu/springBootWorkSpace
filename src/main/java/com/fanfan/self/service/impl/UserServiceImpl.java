package com.fanfan.self.service.impl;

import com.fanfan.self.bean.UserBean;
import com.fanfan.self.mapper.UserMapper;
import com.fanfan.self.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<UserBean> queryAll() {
        return userMapper.getInfo();
    }
}
