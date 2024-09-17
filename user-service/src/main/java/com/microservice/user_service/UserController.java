package com.microservice.user_service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@RefreshScope
public class UserController {

    private final UserService userService;

    @Value("${echo.message.text}")
    private String echoMessageText;

    @Value("${email}")
    private String email;

    @GetMapping("/echo")
    public ResponseEntity<String> getEchoMessage() {
        return ResponseEntity.ok(echoMessageText);
    }

    @GetMapping("/email")
    public String getEmail()
    {
        return email;
    }

    @GetMapping()
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
