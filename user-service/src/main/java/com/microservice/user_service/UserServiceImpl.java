package com.microservice.user_service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Override
    public List<User> getAllUser() {

        return userRepository.findAll();
    }
}