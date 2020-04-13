package com.tms.issuelistbackend.service.impl;

import com.tms.issuelistbackend.controller.dto.SecurityUserDto;
import com.tms.issuelistbackend.controller.dto.UserDto;
import com.tms.issuelistbackend.controller.mapper.SecurityUserDtoMapper;
import com.tms.issuelistbackend.domain.SecurityUser;
import com.tms.issuelistbackend.domain.User;
import com.tms.issuelistbackend.persistence.entity.UserEntity;
import com.tms.issuelistbackend.persistence.repository.UserRepository;
import com.tms.issuelistbackend.security.PassWordEncryption;
import com.tms.issuelistbackend.service.mapper.UserMapper;
import com.tms.issuelistbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper mapper;
    private PassWordEncryption passWordEncryption;



    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public void AddUser(User user) {
        UserEntity userEntity = mapper.map(user);
        userRepository.save(userEntity);
    }

    @Override
    public void verifyPassWord(String userName, String passWord) {
        UserEntity userEntity = userRepository.findPassWordByUserName(userName);
        String storedPassWord = userEntity.getPassWord();
        passWordEncryption.checkEncryptedPassword(passWord, storedPassWord);{
        }
    }
}
