package com.tms.issuelistbackend.service;

import com.tms.issuelistbackend.controller.dto.UserDto;
import com.tms.issuelistbackend.domain.SecurityUser;
import com.tms.issuelistbackend.domain.User;
import com.tms.issuelistbackend.persistence.entity.UserEntity;
import com.tms.issuelistbackend.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void AddUser(User user);

    void verifyPassWord(String userName, String passWord);
}
