package com.zzk.freshman.handle;


import com.zzk.freshman.entity.Result;
import com.zzk.freshman.enums.ResultEnum;
import com.zzk.freshman.exception.StewardessException;
import com.zzk.freshman.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof StewardessException) {
            StewardessException stewardessException = (StewardessException) e;
            return ResultUtil.error(stewardessException.getCode(),
                    stewardessException.getMessage());
        } else {
            logger.error("系统异常:{}", e);
            return ResultUtil.error(ResultEnum.UNKONW_ERROR.getCode(),
                    ResultEnum.UNKONW_ERROR.getMsg());
        }
    }

}
