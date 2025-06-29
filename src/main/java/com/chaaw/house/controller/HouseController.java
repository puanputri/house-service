package com.chaaw.house.controller;

import com.chaaw.house.model.House;
import com.chaaw.house.service.HouseService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
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
        return Response.status(Response.Status.OK).entity(houses).build();
    }

    @POST
    public Response addHouse(House kjbhuj) {
        houseService.addHouse(kjbhuj);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{houseId}")
    public Response updateHouse(@PathParam("houseId") String houseId, House bebas) {
        houseService.updateHouse(houseId, bebas);
        return Response.status(Response.Status.ACCEPTED).build();
    }

    @DELETE
    @Path("/{houseId}")
    public Response deleteHouse(@PathParam("houseId") String houseId) {
        houseService.deleteHouse(houseId);
        return Response.status(Response.Status.ACCEPTED).entity("SUCCESS BRE").build();
    }

    @GET
    @Path("/{houseId}")
    public Response getHouse(@PathParam("houseId") String houseId) {
        House house = houseService.getHouse(houseId);
        return Response.status(Response.Status.ACCEPTED).entity(house).build();
    }


}
