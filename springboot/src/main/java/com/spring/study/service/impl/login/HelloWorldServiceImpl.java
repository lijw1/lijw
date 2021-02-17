package com.spring.study.service.impl.login;

import com.spring.study.dto.login.HelloDto;
import com.spring.study.mapper.login.HelloMapper;
import com.spring.study.service.login.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Autowired
    private HelloMapper helloMapper;
    public List<HelloDto> getUserList(){
        return helloMapper.getUserList();
    }
}
