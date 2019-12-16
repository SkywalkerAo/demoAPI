package com.demo2.util;

import lombok.Data;

import java.io.Serializable;

/**
 * @author SkyWalker
 * @date 2019/12/16.
 */
@Data
public class AjaxResult implements Serializable {
    /**
     * 成功错误码
     */
    private final static Integer ERROR_CODE_SUCCESS = 0;

    /**
     * 请求结果
     */
    private boolean success;

    /**
     * 错误信息描述
     */
    private String errMsg;

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 通用数据区
     */
    private Object data;

    public AjaxResult(boolean success,String errMsg,Integer errorCode,Object data){
        this.success = success;
        this.errMsg =errMsg;
        this.errorCode = errorCode;
        this.data = data;
    }

    public static AjaxResult success() {
        return success("demoSimpleV2.0");
    }

    public static AjaxResult success(Object data){
        return new AjaxResult(true,"",ERROR_CODE_SUCCESS,data);
    }

    public static AjaxResult fail(Integer errorCode,String errMsg){
        return new AjaxResult(false, errMsg,errorCode,null);
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", errMsg='" + errMsg + '\'' +
                ", errorCode=" + errorCode +
                ", data=" + data +
                '}';
    }
}
