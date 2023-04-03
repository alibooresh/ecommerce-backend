package com.hugsy.ecommercebackend.service;

import com.hugsy.ecommercebackend.dtos.RegistrationBody;
import com.hugsy.ecommercebackend.model.LocalUser;
import com.hugsy.ecommercebackend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LocalUser registerUser(RegistrationBody registrationBody){
        LocalUser user = new LocalUser();
        user.setUsername(registrationBody.getUsername());
        user.setEmail(registrationBody.getEmail());
        user.setFirstName(registrationBody.getFirstName());
        user.setLastName(registrationBody.getLastName());
        user.setPhoneNumber(registrationBody.getPhoneNumber());
        //TODO: Encrypt Password!
        user.setPassword(registrationBody.getPassword());
        return userRepository.save(user);
    }
}
