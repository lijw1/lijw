package com.spring.study.common;

/**
 * 返回前端的公共类
 */
public class BaseObjectResult {
    private boolean success;
    private String message;
    private Object object;

    public BaseObjectResult(boolean success, String message, Object object) {
        this.success = success;
        this.message = message;
        this.object = object;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
