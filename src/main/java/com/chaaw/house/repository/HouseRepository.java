package com.chaaw.house.repository;

import com.chaaw.house.model.House;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HouseRepository implements PanacheRepositoryBase<House, String> {
}
