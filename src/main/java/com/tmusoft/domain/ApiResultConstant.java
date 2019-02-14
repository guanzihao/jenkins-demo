package com.tmusoft.domain;

/**
 * @author guanzihao
 * @Title: WeiXinController
 * @ProjectName game_project
 * @Description: TODO
 * @create 2018-06-21 11:33
 * @desc api系统接口结果常量枚举类
 */
public enum ApiResultConstant {

    /**
     * 成功
     */
    SUCCESS(200, "success"),

	/**
     * 失败
     */
    ERROR(500, "系统异常");
    public int code;

    public String message;

    ApiResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
