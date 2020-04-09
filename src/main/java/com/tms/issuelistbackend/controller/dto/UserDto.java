package com.tms.issuelistbackend.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private LocalDate birthDay;
}
