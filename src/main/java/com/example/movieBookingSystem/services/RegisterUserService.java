package com.example.movieBookingSystem.services;

import com.example.movieBookingSystem.model.NewUserRequest;
import com.example.movieBookingSystem.repository.RegisterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    @Autowired
    private RegisterUserRepository registerUserRepository;
    public boolean isRegisterUser(int userId){
        return registerUserRepository.isUserRegistered(userId);
    }

    public boolean registerNewUser(NewUserRequest request) {
        int nextId = registerUserRepository.getMaxID()+1;
        registerUserRepository.addNewUser(nextId,request.getUserName(),request.getEmailId(),request.getPassword(),request.getContactNumber());
        return true;
    }
}
