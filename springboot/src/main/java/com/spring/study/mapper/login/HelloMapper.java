package com.spring.study.mapper.login;

import com.spring.study.dto.login.HelloDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelloMapper {
    public List<HelloDto> getUserList();
}
