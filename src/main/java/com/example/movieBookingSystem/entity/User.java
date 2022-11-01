package com.example.movieBookingSystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    private int userId;

    @Column(name = "contactNumber")
    private int phoneNumber;

    @Column(name = "userName")
    private String userName;

    @Column(name = "emailId")
    private String email;

    @Column(name = "isRegistered")
    private boolean isUserRegistered;

    @Column(name = "isAdmin")
    private boolean isUserAdmin;

    @Column(name = "password")
    private String userPassword;


}
