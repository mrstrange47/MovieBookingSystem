package com.example.movieBookingSystem.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    private int movieId;
    private String movieName;
    private Genre genre;
    private Language languages;
    private String duration;

}
