package com.fanfan.self.service;

import com.fanfan.self.bean.UserBean;

import java.util.List;

public interface UserService {
    List<UserBean> queryAll();
    String loginIn(UserBean ub);
    int addUserInfo(UserBean ub);
    int deleteOneInfo(int id);

    List<UserBean> queryById(int id);
    List<UserBean> queryByName(String name);

    int updateUserInfo(UserBean ub);
}
