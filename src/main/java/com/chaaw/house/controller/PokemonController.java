package com.chaaw.house.controller;

import com.chaaw.house.service.PokemonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pokemons")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PokemonController {
    @Inject
    PokemonService pokemonService;

    @GET
    public Response getPokemon(@QueryParam("name") String name) {
        pokemonService.getPokemon(name);
        return Response.status(Response.Status.OK).entity("success").build();
    }

}
