package com.sample.demo;

import java.util.HashMap;
import java.util.Map;


public class ErrorDomian {
    public static Map<Number, String> map;
    static String error(int code){
        if (map == null) {
            map = new HashMap();
            map.put(ErrorCode.success, "success");
            map.put(ErrorCode.errorpassword, "密码错误");
            map.put(ErrorCode.loginfail, "登录失败");
            map.put(ErrorCode.notfound, "查无结果");
        }

        String desc = map.get(code);
        if (desc == null){
            return "未知错误";
        }else {
            return map.get(code);
        }
    }
}


//public interface ErrorDomian {
//    String success = "success";
//    String errorpwd = "密码错误";
//    String loginfail = "登录失败";
//}