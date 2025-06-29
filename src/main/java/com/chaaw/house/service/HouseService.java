package com.chaaw.house.service;

import com.chaaw.house.model.House;
import com.chaaw.house.repository.HouseRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class HouseService {
    @Inject
    HouseRepository houseRepository;

    public List<House> getHouses() {
        return houseRepository.listAll();
    }

    @Transactional
    public void addHouse(House kjbhuj) {
        houseRepository.persist(kjbhuj);
    }

    @Transactional
    public void updateHouse(String houseId, House bebas) {
        House house = houseRepository.findById(houseId);
        house.setName(bebas.getName());
        houseRepository.persist(house);
    }

    @Transactional
    public void deleteHouse(String houseId) {
        houseRepository.deleteById(houseId);
    }

    public House getHouse(String houseId) {
        return houseRepository.findById(houseId);
    }
}
