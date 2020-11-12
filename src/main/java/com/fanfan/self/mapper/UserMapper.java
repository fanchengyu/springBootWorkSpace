package com.fanfan.self.mapper;

import com.fanfan.self.bean.UserBean;

import java.util.List;

public interface UserMapper {
     List<UserBean> getInfo();
     String getLoginInfo(UserBean ub);
     int addUserInfo(UserBean ub);
     int deleteOneInfo(int id);

     List<UserBean> queryById(int id);

     List<UserBean> queryByName(String name);

    int updateUserInfo(UserBean ub);
}
