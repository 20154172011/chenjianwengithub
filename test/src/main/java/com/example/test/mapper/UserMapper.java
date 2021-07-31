package com.example.test.mapper;

import com.example.test.bean.UserBean;
//mapper层是直接跟数据库打交道的，他也是个接口，只有方法名字，具体实现在mapper.xml文件里
public interface UserMapper {

    UserBean getInfo(String name,String password);

}