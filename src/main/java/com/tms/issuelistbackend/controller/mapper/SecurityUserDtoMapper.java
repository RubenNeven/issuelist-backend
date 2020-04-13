package com.tms.issuelistbackend.controller.mapper;

import com.tms.issuelistbackend.controller.dto.SecurityUserDto;
import com.tms.issuelistbackend.controller.dto.UserDto;
import com.tms.issuelistbackend.domain.SecurityUser;
import com.tms.issuelistbackend.domain.User;
import com.tms.issuelistbackend.security.PassWordEncryption;

public class SecurityUserDtoMapper {

    public SecurityUserDto map(SecurityUser securityUser){
        return SecurityUserDto.builder()
                .userName(securityUser.getUserName())
                .passWord(PassWordEncryption.encryptPassword(securityUser.getPassWord()))
                .build();
    }

    public SecurityUser map(SecurityUserDto securityUserDto) {
        return SecurityUser.builder()
                .userName(securityUserDto.getUserName())
                .passWord(securityUserDto.getPassWord())
                .build();
    }
}
