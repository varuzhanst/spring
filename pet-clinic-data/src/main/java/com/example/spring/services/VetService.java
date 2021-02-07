package com.example.spring.services;

import com.example.spring.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long ID);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
