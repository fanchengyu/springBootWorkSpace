package com.fanfan.self.controller;

import com.fanfan.self.bean.UserBean;

import java.util.List;

public class ResultToWeb {
    public String code;
    public String message;
    public  List<UserBean>  items;
    public int result;
    public ResultToWeb(String code, String message){
        this.code=code;
        this.message=message;
    }
    public ResultToWeb(String code, String message, List<UserBean> ub){
        this.code=code;
        this.message=message;
        this.items=ub;
    }

    public ResultToWeb(String code, int result) {
        this.code=code;
        this.result=result;
    }
}
