package com.tms.issuelistbackend.controller.mapper;

import com.tms.issuelistbackend.controller.dto.UserDto;
import com.tms.issuelistbackend.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {

    public UserDto map(User user){
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .birthDay(user.getBirthDay())
                .userName(user.getUserName())
                .passWord(user.getPassWord())
                .build();
    }

    public User map(UserDto user) {
        return User.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .birthDay(user.getBirthDay())
                .userName(user.getUserName())
                .passWord(user.getPassWord())
                .build();
    }
}
