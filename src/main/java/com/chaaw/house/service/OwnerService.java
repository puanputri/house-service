package com.chaaw.house.service;

import com.chaaw.house.model.House;
import com.chaaw.house.model.Owner;
import com.chaaw.house.repository.HouseRepository;
import com.chaaw.house.repository.OwnerRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class OwnerService {
    @Inject
    OwnerRepository ownerRepository;

    public List<Owner> getOwners() {
        return ownerRepository.listAll();
    }
}
