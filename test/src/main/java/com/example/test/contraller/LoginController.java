package com.example.test.contraller;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import  com.example.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * 在SpringMVC中，控制器Controller负责处理由DispatcherServlet分发的请求，它把用户请求的数据经过业务处理层处理之后封装成一个Model，
 * 然后再把该Model返回给对应的View进行展示。在SpringMVC中提供了一个非常简单的定义Controller的方法，你无需继承特定的类或实现特定的接口，
 * 只需使用@Controller标记一个类是Controller，然后使用@RequestMapping和@RequestParam等一些注解用以定义URL请求和Controller方法之间的映射，
 * 这样的Controller就能被外界访问到。此外Controller不会直接依赖于HttpServletRequet和HttpServletResponse等HttpServlet对象。
 */
@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    /**
     *     @RequestMapping("/login")
     *     login  就是一个SpringMVC Controller 对象了， 表示当请求/login 的时候访问的是login方法
     *     @RequestMapping 来映射URL 到控制器类，或者是到Controller 控制器的处理方法上。
     *     @Controller 只是定义了一个控制器类，而使用@RequestMapping 注解的方法才是真正处理请求的处理器
     *
     */
    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
/**
 *
 */
          UserMapper usermapper;
            UserBean userBean = userService.loginIn(name,password);

        if(userBean!=null){
         return "success";
        }else {
            return "error";
        }
    }

}
