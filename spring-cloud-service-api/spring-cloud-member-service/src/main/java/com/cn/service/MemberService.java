package com.cn.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "会员接口")
public interface MemberService {

    @ApiOperation(value = "获取会员")
    @GetMapping("/getMember")
    String getMember();
}
