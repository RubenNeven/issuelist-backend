package com.tms.issuelistbackend.controller;

import com.tms.issuelistbackend.controller.mapper.UserDtoMapper;
import com.tms.issuelistbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UserController {

    private UserService userService;
    private UserDtoMapper mapper;

    @Autowired
    public UserController(UserService userService, UserDtoMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }
}
