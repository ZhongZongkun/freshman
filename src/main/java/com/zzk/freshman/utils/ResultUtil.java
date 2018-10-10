package com.zzk.freshman.utils;

import com.zzk.freshman.entity.Result;
import com.zzk.freshman.enums.ResultEnum;

public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);

        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);

        return result;
    }
}
