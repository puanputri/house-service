package com.chaaw.house.client;

import io.vertx.core.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://pokeapi.co/api/v2")
@Path("/pokemon")
public interface PokemonRestClient {
    
    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    JsonObject getPokemon(@PathParam("name") String name);
}