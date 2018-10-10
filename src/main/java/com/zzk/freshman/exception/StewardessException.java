package com.zzk.freshman.exception;

import com.zzk.freshman.enums.ResultEnum;

public class StewardessException extends RuntimeException {

    private Integer code;

    public StewardessException(ResultEnum resultEnum) {
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
