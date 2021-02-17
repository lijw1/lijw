package com.spring.study.service.login;

import com.spring.study.common.BaseListResult;
import com.spring.study.common.BaseObjectResult;
import com.spring.study.dto.login.User;

import java.util.List;

public interface UserService {
    public BaseListResult pageList(User user);

    public BaseObjectResult add(User user);

    public BaseObjectResult update(User user);

    public BaseObjectResult delete(User user);
}
