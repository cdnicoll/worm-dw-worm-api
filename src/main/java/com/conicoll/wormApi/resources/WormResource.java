package com.conicoll.wormApi.resources;

import com.conicoll.wormApi.dao.WormDAO;
import com.conicoll.wormApi.models.Hero;
import org.skife.jdbi.v2.DBI;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by conicoll on 2015-12-17.
 */
@Path("/api/worm")
@Produces(MediaType.APPLICATION_JSON)
public class WormResource
{
    private final WormDAO wormDAO;

    public WormResource(DBI jdbi)
    {
        wormDAO = jdbi.onDemand(WormDAO.class);
    }

    @GET
    @Path("/")
    public Response getAll()
    {
        List<Hero> heroes = wormDAO.getAllHeroes();
        return Response.ok(heroes).build();
    }

    @GET
    @Path("/{id}")
    public Response getHero(@PathParam("id") int id)
    {
        Hero hero = wormDAO.getHeroById(id);
        return Response.ok(hero).build();
    }

    @GET
    @Path("/name/{name}")
    public Response getHeroByName(@PathParam("name") String name)
    {
        Hero hero = wormDAO.getHeroByHeroName(name);
        return Response.ok(hero).build();
    }
}
