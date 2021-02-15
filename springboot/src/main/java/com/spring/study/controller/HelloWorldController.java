package com.spring.study.controller;

import com.spring.study.dto.HelloDto;
import com.spring.study.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public List<HelloDto> hello() {
        return helloWorldService.getUserList();
    }
}
