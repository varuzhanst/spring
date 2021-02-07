package com.example.spring.services;

import com.example.spring.model.Owner;
import com.example.spring.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long ID);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
