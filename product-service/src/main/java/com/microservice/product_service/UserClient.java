package com.microservice.product_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service")

public interface UserClient {
    @GetMapping("api/v1/users/hello")
    String getUserHello();
}
