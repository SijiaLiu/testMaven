package com.lsj.utils;

import com.lsj.Entity.Result;

/**
 * Created by liusijia on 2017/9/25.
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result success(){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(success(null));
        return result;
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
