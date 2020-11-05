package com.fanfan.self.controller;

import com.fanfan.self.bean.UserBean;
import com.fanfan.self.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RestController
public class HelloController {
    @Resource
    UserService us;

    @RequestMapping ("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/api/getUserInfo",method= RequestMethod.GET)
    public  List<UserBean>  getAll(){
        List<UserBean>  list_ub= us.queryAll();
        return  list_ub;
    }
}
