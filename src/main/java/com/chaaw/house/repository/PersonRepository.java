package com.chaaw.house.repository;

import com.chaaw.house.model.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheRepositoryBase<Person, String> {
}
