package com.lsj.handle;

import com.lsj.Entity.Result;
import com.lsj.exception.PersonException;
import com.lsj.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liusijia on 2017/9/25.
 */
@ControllerAdvice
public class HandleException {

    private static final Logger logger = LoggerFactory.getLogger(HandleException.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof PersonException){
            PersonException personException = (PersonException) e;
            return ResultUtil.error(personException.getCode(), personException.getMessage());
        }else {
            logger.error("【系统错误】{}", e);
            return ResultUtil.error(-1, e.getMessage());
        }
    }
}
