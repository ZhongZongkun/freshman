package com.zzk.freshman.enums;

public enum ResultEnum {
    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(100, "查询成功"),
    NONE_RESULT(101, "未查询到信息，请确认输入的查询条件"),
    EMPTY_CONDITION(102, "查询条件不符合要求"),

    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
