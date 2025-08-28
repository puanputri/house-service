package com.chaaw.house.service;

import com.chaaw.house.client.PokemonRestClient;
import io.vertx.core.json.JsonObject;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class PokemonService {
    @RestClient
    PokemonRestClient pokemonRestClient;

    public void getPokemon(String name) {
        JsonObject obj = pokemonRestClient.getPokemon(name);
        System.out.println(obj.getJsonArray("held_items").getJsonObject(1).getJsonObject("item").getString("name"));
    }
}

//create 4 api pokemon and 1 creative service selain data pokemon
