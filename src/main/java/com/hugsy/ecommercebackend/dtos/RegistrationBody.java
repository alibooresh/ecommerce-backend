package com.hugsy.ecommercebackend.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationBody {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
}
