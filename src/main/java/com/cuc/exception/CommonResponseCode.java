package com.cuc.exception;

/**
 * @Author:ywf
 */
public enum CommonResponseCode {
    success(0, "成功"),
    fail(1, "操作失败!"),
    loginInvalid(100, "登录失败!"),
    passwordInvalid(104, "密码错误"),
    dataExist(211, "数据已存在!"),
    dataNotExist(212, "查找的数据不存在!")
    ;

    private Integer code;
    private String name;

    private CommonResponseCode(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getCode() {
        return this.code;
    }
}
