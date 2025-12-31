package com.example.assignment1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player extends BasePlayer{

    private Long age;
    private Long playerRank;
}
