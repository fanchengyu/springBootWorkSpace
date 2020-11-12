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
    private UserMapper um;
    @Override
    public List<UserBean> queryAll() {
        return um.getInfo();
    }

    @Override
    public String loginIn(UserBean ub) {
        return um.getLoginInfo(ub);
    }

    @Override
    public int addUserInfo(UserBean ub) {
        return um.addUserInfo(ub);
    }

    @Override
    public int deleteOneInfo(int id) {
        return um.deleteOneInfo(id);
    }

    @Override
    public List<UserBean> queryById(int id) {
        return um.queryById(id);
    }

    @Override
    public List<UserBean> queryByName(String name) {
        return um.queryByName(name);
    }

    @Override
    public int updateUserInfo(UserBean ub) {
        return um.updateUserInfo(ub);
    }
}
