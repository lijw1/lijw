package com.spring.study.controller.login;

import com.spring.study.common.BaseListResult;
import com.spring.study.common.BaseObjectResult;
import com.spring.study.dto.login.User;
import com.spring.study.service.login.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/pageUserList")
    @ResponseBody
    public BaseListResult pageList(User user){
       return userService.pageList(user);
    }

    @RequestMapping("/add")
    public BaseObjectResult add(User user){
        return userService.add(user);
    }

    @RequestMapping("/update")
    public BaseObjectResult update(User user){
        return userService.update(user);
    }

    @RequestMapping("/delete")
    public BaseObjectResult delete(User user){
        return userService.delete(user);
    }

}
