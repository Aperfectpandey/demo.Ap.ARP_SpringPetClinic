package com.example.services;

import com.example.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner save(Owner own);

    Set<Owner> findAll();
}
