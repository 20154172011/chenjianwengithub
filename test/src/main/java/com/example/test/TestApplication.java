package com.example.test;

//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//@MapperScan("com.example.test.mapper")
//public class TestApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(TestApplication.class, args);
//    }
//
//}

//1
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//@MapperScan("com.example.test.mapper")
//public class TestApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(TestApplication.class, args);
//    }
//
//}

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.test.mapper")
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}


@RunWith(SpringRunner.class)
@SpringBootTest
 class TestApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("a","a");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}


