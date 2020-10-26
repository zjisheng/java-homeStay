package com.cuc.vo;

import com.alibaba.fastjson.JSON;
import com.cuc.exception.CommonResponseCode;

/**
 * @Author:ywf
 */
public class JsonResponse<T> {
    private Integer code = null;
    private String message = null;
    private T result = null;

    public JsonResponse() {
    }

    public JsonResponse(CommonResponseCode commonErrorCode) {
        this.code = commonErrorCode.getCode();
        this.message = commonErrorCode.getName();
    }

    public JsonResponse(CommonResponseCode commonErrorCode, T result) {
        this.code = commonErrorCode.getCode();
        this.message = commonErrorCode.getName();
        this.result = result;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String toJSONString() {
        return JSON.toJSONString(this);
    }
}
