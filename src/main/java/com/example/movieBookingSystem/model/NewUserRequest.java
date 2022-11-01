package com.example.movieBookingSystem.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewUserRequest {
    private String userName;
    private String password;
    private String contactNumber;
    private String emailId;
}
