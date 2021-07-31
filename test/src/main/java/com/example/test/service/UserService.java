package com.example.test.service;
import com.example.test.bean.UserBean;
import org.springframework.web.bind.annotation.ResponseBody;

public interface UserService {


    @ResponseBody
    UserBean loginIn(String name,String password);
}







