package com.example.movieBookingSystem.api;

import com.example.movieBookingSystem.model.NewUserRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
public interface RegisterControllerApi {

    @GetMapping("movieApp/isRegistered")
    boolean isRegistered (@PathVariable int userId);

    @PostMapping("movieApp/registerUser")
    boolean registerUser(@PathVariable NewUserRequest request);

}
