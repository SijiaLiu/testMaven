package com.lsj.exception;

import com.lsj.enums.ResultEnum;

/**
 * Created by liusijia on 2017/9/25.
 * 默认的Exception只能传一个message
 * 自定义异常 想传什么就传什么
 */
public class PersonException extends RuntimeException{

    private Integer code;

    public PersonException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
