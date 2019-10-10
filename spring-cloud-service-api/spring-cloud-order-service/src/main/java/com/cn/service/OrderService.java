package com.cn.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "订单服务接口")
public interface OrderService {

    @ApiOperation(value = "获取订单")
    @GetMapping("/getOrder")
    String getOrder();
}
