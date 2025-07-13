// src/main/java/com/chaaw/house/service/PersonService.java
package com.chaaw.house.service;

import com.chaaw.house.model.Person;
import com.chaaw.house.repository.PersonRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class PersonService {

    @Inject
    PersonRepository personRepo;

    /**
     * Persist a person and its cars in one transaction.
     */
    @Transactional
    public Person create(Person person) {
        if (person.getCars() != null) {
            person.getCars().forEach(car -> car.setPerson(person));
        }
        personRepo.persist(person);
        return person;
    }

    /**
     * Fetch a person by ID, or throw if not found.
     */
    public Person findById(String id) {
        return personRepo.findByIdOptional(id)
                .orElseThrow(() -> new IllegalArgumentException("Person not found"));
    }
}
