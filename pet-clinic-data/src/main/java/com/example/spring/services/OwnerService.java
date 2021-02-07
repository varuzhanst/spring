package com.example.spring.services;

import com.example.spring.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(long ID);
    Owner save(Owner owner);
    Owner findByLastName(String lastname);
    Set<Owner> findAll();

}
