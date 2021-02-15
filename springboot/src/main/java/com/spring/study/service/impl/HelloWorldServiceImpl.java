package com.spring.study.service.impl;

import com.spring.study.dto.HelloDto;
import com.spring.study.mapper.HelloMapper;
import com.spring.study.service.HelloWorldService;
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
