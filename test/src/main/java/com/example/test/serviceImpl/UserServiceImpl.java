package com.example.test.serviceImpl;



import com.example.test.bean.UserBean;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
        private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper=userMapper;
    }

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
