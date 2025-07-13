// src/main/java/com/chaaw/house/resource/PersonResource.java
package com.chaaw.house.controller;

import com.chaaw.house.model.Person;
import com.chaaw.house.service.PersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

import java.net.URI;


/**
 * Exposes only two endpoints:
 *  - POST /persons      → create person + cars
 *  - GET  /persons/{id} → fetch person + cars
 */
@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

    @Inject
    PersonService personService;

    @POST
    public Response create(Person person, @Context UriInfo uriInfo) {
        Person created = personService.create(person);
        URI location = uriInfo.getAbsolutePathBuilder()
                .path(created.getId())
                .build();
        return Response.created(location)
                .entity(created)
                .build();
    }

    @GET
    @Path("/{id}")
    public Person get(@PathParam("id") String id) {
        return personService.findById(id);
    }
}
