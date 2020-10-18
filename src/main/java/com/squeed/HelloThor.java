package com.squeed;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloThor {

    public static class Response {

        public String quarkusResponse;

        public Response() { }

        public Response(String resp) {
            this.quarkusResponse = resp;
        }
    }

    public static class Request {
        public String arg1;

        public Request() {}

        public Request(String arg) {
            arg1 = arg;
        }
    }

    @GET()
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{input}")
    public String hello(@PathParam String input) {
        return "This response is from Thor. Your input was: " + input;
    }

    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response helloPost(String input) {
        System.out.println("Received input " + input);
        return new Response("This response is from Thor. Your input was: " + input);
    }
    @POST()
    @Path("/event")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response helloEvent(String input) {
        System.out.println("Received event notification input: " + input);
        return new Response("Executing arbitrary code in response to received event input: " + input);
    }
}