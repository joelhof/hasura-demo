package com.squeed;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/external")
public class ExternalRestEndpoint {

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
        return "This response is from Quarkus!. Your input was: " + input;
    }

    @POST()
    @Path("/event")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response helloEvent(String input) {
        System.out.println("Received event notification input: " + input);
        return new Response(
                "Received event notification from Hasura." +
                        " Here we could do whatever we want like publish a message on a fancy Kafka queue, " +
                        "or even send a good old fashioned email...");
    }
}