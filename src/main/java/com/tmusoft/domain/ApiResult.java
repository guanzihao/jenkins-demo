package com.tmusoft.domain;

/**
 * @author guanzihao
 * @Title: WeiXinController
 * @ProjectName game_project
 * @Description: TODO
 * @create 2018-06-21 11:33
 * @desc api系统常量枚举类
 */
public class ApiResult extends BaseResult {

    public ApiResult(int code, String message, Object data) {
        super(code, message, data);
    }

    public ApiResult(ApiResultConstant apiResultConstant, Object data) {
        super(apiResultConstant.getCode(), apiResultConstant.getMessage(), data);
    }

}
