package com.contain;

public enum ColorEnum implements IExceptionEnum {
    FREE("101", "找不到资源"),
    GREEN("102", "类异常"),
    BLUE("103", "都是")
    ;

    private String code;
    private String msg;

    private ColorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;

    }
    @Override
    public String getCode() {
        return code;
    }

    /*@Override
    public String getMsg() {
        return msg;
    }*/

    public String getMsg() {
        return msg;
    }
}
