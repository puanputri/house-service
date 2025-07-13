package com.chaaw.house.repository;

import com.chaaw.house.model.Car;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarRepository implements PanacheRepositoryBase<Car, String> {
}
