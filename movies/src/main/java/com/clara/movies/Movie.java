package com.clara.movies;

import lombok.Data;

import javax.persistence.*;

@Entity @Data @Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
