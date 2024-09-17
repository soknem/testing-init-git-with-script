package com.microservice.product_service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@RefreshScope
class ProductController {

    private final UserClient userClient;

    @Value("${email}")
    private String email;

    @GetMapping("/hello")
    public String hello() {
        String userResponse = userClient.getUserHello();
        return "Hello from Product Service! " + userResponse;
    }



    @GetMapping("/email")
    public String getEmail()
    {
        return email;
    }
}
