package com.lsj.enums;

/**
 * Created by liusijia on 2017/9/25.
 * 使用枚举定义异常码对应的信息
 */
public enum ResultEnum {

    UNKNOWN_ERROR(-1, "未知错误"),
    SUCCESS(0, "SUCCESS"),
    PRIMARY_SCHOOL(100, "小孩子"),
    MIDDLE_SCHOOL(101, "初中生");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
