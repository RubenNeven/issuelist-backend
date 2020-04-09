package com.tms.issuelistbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private LocalDate birthDay;
    private String emailAddress;
}
