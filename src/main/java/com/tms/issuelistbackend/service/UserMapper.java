package com.tms.issuelistbackend.service;

import com.tms.issuelistbackend.domain.User;
import com.tms.issuelistbackend.persistence.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User map(UserEntity userEntity){
        return User.builder()
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .emailAddress(userEntity.getEmailAddress())
                .birthDay(userEntity.getBirthDay())
                .userName(userEntity.getPassWord())
                .passWord(userEntity.getPassWord())
                .build();
    }

    public UserEntity map(User user){
        return UserEntity.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .birthDay(user.getBirthDay())
                .userName(user.getPassWord())
                .passWord(user.getPassWord())
                .build();
    }
}
