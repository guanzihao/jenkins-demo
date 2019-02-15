package com.tmusoft.controller;

import com.tmusoft.domain.ApiResult;
import com.tmusoft.domain.ApiResultConstant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 描述:jenkins的首页测试
 *
 * @author guanzihao
 * @create 2019-02-14 15:31
 */
@RestController
@RequestMapping("index")
public class IndexController {

    @GetMapping(value = "index")
    public ResponseEntity<ApiResult> index(@RequestParam(value = "name", required = false) String name) {

        if (name == null || name == "") {
            name = String.valueOf(UUID.randomUUID()).replaceAll("-", "");
        }

        String str = "=================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>%s<<<<<<<<<<<<<<<<<<<<";

        System.out.println(String.format(str,name));

        return ResponseEntity.ok(new ApiResult(ApiResultConstant.SUCCESS,name));
    }

}
