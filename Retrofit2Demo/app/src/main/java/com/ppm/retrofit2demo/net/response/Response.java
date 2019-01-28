package com.ppm.retrofit2demo.net.response;

public class Response<T> {

    private int ret;

    private T data;

    private String msg;

    public int getCode() {
        return ret;
    }

    public void setCode(int ret) {
        this.ret = ret;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
