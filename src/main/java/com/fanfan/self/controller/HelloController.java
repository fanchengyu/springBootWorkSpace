package com.fanfan.self.controller;

import com.fanfan.self.bean.UserBean;
import com.fanfan.self.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /**查询所有信息*/
    @RequestMapping(value="/api/getUserInfo",method= RequestMethod.GET)
    public  ResultToWeb  getAll(){
        List<UserBean>  list_ub= us.queryAll();
          return  new ResultToWeb("0","查询成功",list_ub);
    }
    /**登录接口*/
    @PostMapping("/api/loginSystem")
        public ResultToWeb  loginSystem(@RequestBody UserBean  ub){
            String result=us.loginIn(ub);
            String InPassWord=ub.getPass_word();
            if(result==null){
                return  new ResultToWeb("1","用户名不存在");
            }else{
                if(!InPassWord.equals(result)){
                    return  new ResultToWeb("2","密码错误");
                }else{
                    ResultToWeb re=new ResultToWeb("0","登录成功");
                    return  re;
                }
            }
        }
    /**增加数据*/
    @PostMapping("/api/addUserInfo")
        public  ResultToWeb  addMyUserInfo(@RequestBody UserBean  ub){
        /**校验name是否已经存在*/
        List<UserBean>  list_ub= us.queryByName(ub.name);
        if(list_ub.size()==1){
            return new ResultToWeb("2","用户名"+ub.name+"已经存在");
        }
            int result =us.addUserInfo(ub);
            if(result==1){
                return  new ResultToWeb("0",result);
            }else{
                return  new ResultToWeb("1","参数异常");
            }

    }
    /**删除单条数据*/
    @DeleteMapping("/api/delete")
        public ResultToWeb  deleteOneInfo(@RequestParam int id){
        List<UserBean>  list_ub= us.queryById(id);
            System.out.println(list_ub.size());
            if(list_ub.size()==1){
                us.deleteOneInfo(id);
                return  new ResultToWeb("0","删除成功",list_ub);
            }else{
                return  new ResultToWeb("1","删除失败，id不存在");
            }
    }
    /**编辑单条数据 */
    @PatchMapping("/api/updateInfo")
    public ResultToWeb  updateMyInfo(@RequestBody UserBean  ub){
        int id=ub.getId();
        List<UserBean>  list_ub_o= us.queryById(id);
        if(list_ub_o.size()!=1){
            return new ResultToWeb("3","ID"+id+"不存在");
        }

        /**校验name是否已经存在*/
        List<UserBean>  list_ub= us.queryByName(ub.name);
        if(list_ub.size()==1){
            if(list_ub.get(0).getId()!=id){
                return new ResultToWeb("2","用户名"+ub.name+"已经存在");
            }
        }

        int result =us.updateUserInfo(ub);
        if(result==1){
            return  new ResultToWeb("0",result);
        }else{
            return  new ResultToWeb("1","参数异常");
        }
    }
}
