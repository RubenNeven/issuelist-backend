package com.tms.issuelistbackend.controller;

import com.tms.issuelistbackend.controller.dto.UserDto;
import com.tms.issuelistbackend.controller.mapper.UserDtoMapper;
import com.tms.issuelistbackend.domain.User;
import com.tms.issuelistbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;
    private UserDtoMapper mapper;

    @Autowired
    public UserController(UserService userService, UserDtoMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody @Valid UserDto userDto) {
        User user = mapper.map(userDto);
        userService.AddUser(user);
    }



}
