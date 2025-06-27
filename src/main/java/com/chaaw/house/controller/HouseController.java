package com.chaaw.house.controller;

import com.chaaw.house.model.House;
import com.chaaw.house.service.HouseService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/v1/houses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HouseController {
    @Inject
    HouseService houseService;

    @GET
    public Response getHouses() {
        List<House> houses = houseService.getHouses();
        return Response.status(Response.Status.OK).entity("Success Bele!").build();
    }
}
