package com.tms.issuelistbackend.service.mapper;

import com.tms.issuelistbackend.controller.dto.UserDto;
import com.tms.issuelistbackend.domain.User;
import com.tms.issuelistbackend.security.PassWordEncryption;
import com.tms.issuelistbackend.persistence.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private PassWordEncryption passWordEncryption;

    public User map(UserEntity userEntity){
        return User.builder()
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .emailAddress(userEntity.getEmailAddress())
                .birthDay(userEntity.getBirthDay())
                .userName(userEntity.getUserName())
                .passWord(userEntity.getPassWord())
                .confirmPassWord(userEntity.getConfirmPassWord())
                .build();
    }

    public UserEntity map(User user){
        return UserEntity.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .birthDay(user.getBirthDay())
                .userName(user.getUserName())
                .passWord(user.getPassWord())
                .confirmPassWord(user.getConfirmPassWord())
                .build();
    }

    public UserDto maptoDto(UserEntity userEntiy){
        return UserDto.builder()
                .firstName(userEntiy.getFirstName())
                .lastName(userEntiy.getLastName())
                .emailAddress(userEntiy.getEmailAddress())
                .birthDay(userEntiy.getBirthDay())
                .userName(userEntiy.getUserName())
                .passWord(userEntiy.getPassWord())
                .confirmPassWord(userEntiy.getConfirmPassWord())
                .build();
    }
}
