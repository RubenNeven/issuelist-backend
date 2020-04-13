package com.tms.issuelistbackend.controller;

import com.tms.issuelistbackend.controller.dto.SecurityUserDto;
import com.tms.issuelistbackend.controller.dto.UserDto;
import com.tms.issuelistbackend.controller.mapper.SecurityUserDtoMapper;
import com.tms.issuelistbackend.controller.mapper.UserDtoMapper;
import com.tms.issuelistbackend.domain.SecurityUser;
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
    private SecurityUserDtoMapper securityUserDtoMapper;

    @Autowired
    public UserController(UserService userService, UserDtoMapper mapper, SecurityUserDtoMapper securityUserDtoMapper) {
        this.userService = userService;
        this.mapper = mapper;
        this.securityUserDtoMapper = securityUserDtoMapper;
    }



    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody @Valid UserDto userDto) {
        User user = mapper.map(userDto);
        userService.AddUser(user);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void verifyUserPassWord(@RequestBody @Valid SecurityUserDto securityUserDto){
        SecurityUser securityUser = securityUserDtoMapper.map(securityUserDto);
        userService.verifyPassWord(securityUser.getUserName(), securityUser.getPassWord());
    }
}
