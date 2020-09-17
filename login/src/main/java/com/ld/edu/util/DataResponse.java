package com.ld.edu.util;


import lombok.Data;

/**
 * @author: Li dong.
 * @date: 2020/4/30 - 9:47
 */
@Data
public class DataResponse {

    private int code;
    private String message;
    private String token;
    private Object data;

    private DataResponse() {

    }

    //请求出现异常时的响应数据封装
    public static DataResponse error(Object data) {

        DataResponse resultBean = new DataResponse();
        resultBean.setCode(400);
        resultBean.setMessage("failed");
        resultBean.setData(data);
        return resultBean;
    }

    public static DataResponse success() {
        DataResponse resultBean = new DataResponse();
        resultBean.setCode(200);
        resultBean.setMessage("success");
        return resultBean;
    }

    public static DataResponse success(Object data, String token) {
        DataResponse resultBean = new DataResponse();
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);
        resultBean.setToken(token);
        return resultBean;
    }

    public static DataResponse success(Object data) {
        DataResponse resultBean = new DataResponse();
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);
        return resultBean;
    }

}
