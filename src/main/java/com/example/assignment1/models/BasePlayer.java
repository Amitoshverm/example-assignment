package com.example.assignment1.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public class BasePlayer {
    @Id
    private UUID id;
    private String name;
}
