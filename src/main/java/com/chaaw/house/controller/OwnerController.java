package com.chaaw.house.controller;

import com.chaaw.house.model.House;
import com.chaaw.house.model.Owner;
import com.chaaw.house.service.OwnerService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/v1/owners")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OwnerController {
    @Inject
    OwnerService ownerService;

    @GET
    public Response getHouses() {
        List<Owner> owners = ownerService.getOwners();
        return Response.status(Response.Status.OK).entity(owners).build();
    }

}
