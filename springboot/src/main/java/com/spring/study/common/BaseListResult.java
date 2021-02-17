package com.spring.study.common;

import java.util.List;
/**
 * 返回前端的公共类
 */
public class BaseListResult extends BaseObjectResult {
    private List<Object> list;

    public BaseListResult(boolean success, String message, Object object, List<Object> list) {
        super(success, message, object);
        this.list = list;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}
