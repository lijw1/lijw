package com.spring.study.service.impl.login;

import com.spring.study.common.BaseListResult;
import com.spring.study.common.BaseObjectResult;
import com.spring.study.dto.login.User;
import com.spring.study.mapper.login.UserMapper;
import com.spring.study.service.login.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseListResult pageList(User user) {
        List<User> list = userMapper.pageList(user);
        return new BaseListResult(true,"查询成功",null,list);
    }

    @Override
    public BaseObjectResult add(User user) {
        int number = userMapper.add(user);
        if(number< 0){
            return new BaseObjectResult(true,"新增成功！",user);
        }else {
            return new BaseObjectResult(false,"新增失败",user);
        }
    }

    @Override
    public BaseObjectResult update(User user) {
        int number = userMapper.update(user);
        if(number< 0){
            return new BaseObjectResult(true,"更新成功！",user);
        }else {
            return new BaseObjectResult(false,"更新失败",user);
        }
    }

    @Override
    public BaseObjectResult delete(User user) {
        int number = userMapper.delete(user);
        if(number< 0){
            return new BaseObjectResult(true,"删除成功！",user);
        }else {
            return new BaseObjectResult(false,"删除失败",user);
        }
    }
}
