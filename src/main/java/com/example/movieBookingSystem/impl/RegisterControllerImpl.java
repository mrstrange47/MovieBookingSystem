package com.example.movieBookingSystem.impl;

import com.example.movieBookingSystem.api.RegisterControllerApi;
import com.example.movieBookingSystem.model.NewUserRequest;
import com.example.movieBookingSystem.services.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;


public class RegisterControllerImpl implements RegisterControllerApi {

    @Autowired
    RegisterUserService registerUserService;

    @Override
    public boolean isRegistered(int userId) {
        return registerUserService.isRegisterUser(userId);
    }

    @Override
    public boolean registerUser(NewUserRequest request) {
        return registerUserService.registerNewUser(request);
    }
}
