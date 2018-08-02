package com.pretend.jaxtesting;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/")
public class RestService {
	public int testing = 0;
	
	@GET
    @Path("/json")
    @Produces({ "application/json" })
    public String getHelloWorldJSON() {
        return "{\"result\":\"" + testing + "\"}";
    }
	@GET
    @Path("/json/{id}")
    @Produces({ "application/json" })
    public String getHelloexampleJSON(@PathParam("id") String id) {
        return "{\"result\":\"" + id + "\"}";
    }
	

}
