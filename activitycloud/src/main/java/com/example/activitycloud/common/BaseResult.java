package com.example.activitycloud.common;


/**
 * Created by Hw Du on 2018/7/27.
 */
public class BaseResult<T> {
    private String message;
    private boolean success;
    private T data;

    public BaseResult() {
    }

    public BaseResult(String message, boolean success, T data) {
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public void construct(String message, boolean success, T data){
        this.message = message;
        this.success = success;
        this.data = data;
    }
    public void construct(String message, boolean success){
        this.message = message;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
