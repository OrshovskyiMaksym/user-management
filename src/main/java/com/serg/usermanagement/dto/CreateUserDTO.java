package com.serg.usermanagement.dto;

import lombok.Data;

@Data
public class CreateUserDTO {

    private String password;
    private String fullName;
    private String email;

}
