package com.hugsy.ecommercebackend.controller.auth;

import com.hugsy.ecommercebackend.dtos.RegistrationBody;
import com.hugsy.ecommercebackend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private UserService userService;

    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public void register(@RequestBody RegistrationBody registrationBody) {
        userService.registerUser(registrationBody);
        this.welcome(registrationBody);
    }

    private void welcome(RegistrationBody registrationBody) {
        System.out.println("Dear " + registrationBody.getFirstName() + " " + registrationBody.getLastName() + ", Welcome!");
    }
}
