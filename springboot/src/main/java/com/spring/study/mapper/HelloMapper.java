package com.spring.study.mapper;

import com.spring.study.dto.HelloDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelloMapper {
    public List<HelloDto> getUserList();
}
