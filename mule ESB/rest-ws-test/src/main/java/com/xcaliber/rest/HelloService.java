package com.xcaliber.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {
	@GET
	@Path("/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getName(@PathParam("name") String myName) {
		String output = "Hello Server say : Hello there, " + myName;
		return Response.status(200).entity(output).build();
	}

}
