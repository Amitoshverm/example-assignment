package com.example.assignment1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    private Long id;
    private String name;
    private Long age;
    private Long playerRank;
}
