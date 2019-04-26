package com.sample.demo;

import java.util.Map;

/**
 * code: 自定义的错误码，区别于Restfull定义的错误码
 * 用于描述业务逻辑错误
 *
 * desc: 描述
 *
 * res: 请求返回值的主体
 * */



public class ClientReseponseEntity {
    public int code = ErrorCode.success;
    public String desc="success";
    public Object res = null;

    public void setCode(int code) {
        this.code = code;
        this.desc = ErrorDomian.error(code);
    }
}
