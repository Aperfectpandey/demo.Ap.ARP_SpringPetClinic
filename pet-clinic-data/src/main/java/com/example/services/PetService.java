package com.example.services;

import com.example.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet own);

    Set<Pet> findAll();
}
