package com.fanfan.self;

import com.fanfan.self.bean.UserBean;
import com.fanfan.self.service.UserService;
import com.fanfan.self.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SelfApplicationTests {
    @Autowired
    UserService us;
    @Test
    void contextLoads() {
        //
    }

    @Test
    void serviceTest(){
      System.out.println(us.queryAll());
    }

}
