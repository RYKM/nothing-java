package com.example.nothing.util;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author YJL
 * @Create 2022/5/8
 */
@Data
public class JsonResult implements Serializable {
    private static final long serialVersionUID = 844551402928292015L;
    /**返回状态码*/
    private Boolean success;
    /**返回信息*/
    private String msg;
    /**返回数据*/
    private Object obj;

    public JsonResult(Boolean success) {
        this.success = success;
    }
}
