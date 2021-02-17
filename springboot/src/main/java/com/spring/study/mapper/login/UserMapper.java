package com.spring.study.mapper.login;

import com.spring.study.dto.login.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> pageList(User user);

    public int add(User user);

    public int update(User user);

    public int delete(User user);
}
