package com.chaaw.house.repository;

import com.chaaw.house.model.House;
import com.chaaw.house.model.Owner;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OwnerRepository implements PanacheRepositoryBase<Owner, String> {
}
