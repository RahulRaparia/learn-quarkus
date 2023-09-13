package org.acme;

import org.acme.entities.Greeting;
import org.jboss.resteasy.reactive.RestQuery;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Transactional
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name") String name) {
        Greeting greeting = new Greeting();
        greeting.name = name;
        greeting.persist();
        return "Hello " + name;
    }
}
