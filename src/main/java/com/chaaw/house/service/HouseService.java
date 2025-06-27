package com.chaaw.house.service;

import com.chaaw.house.model.House;
import com.chaaw.house.repository.HouseRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class HouseService {
    @Inject
    HouseRepository houseRepository;

    public List<House> getHouses() {
        return houseRepository.listAll();
    }
}
