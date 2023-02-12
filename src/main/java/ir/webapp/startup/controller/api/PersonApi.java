package ir.webapp.startup.controller.api;

import com.google.gson.Gson;
import ir.webapp.startup.controller.app.PersonController;
import ir.webapp.startup.controller.app.TokenController;
import ir.webapp.startup.model.entity.Person;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.io.PrintWriter;
import java.util.List;

@Path("/person")
public class PersonApi {

    @GET
    @Path("/getAllPerson/{token}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll(@PathParam("token") String token){
        if (TokenController.getTokenController().checkToken(token))
            return new Gson().toJson(PersonController.findAll());
        else
            return "AccessDenied";
    }


//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    public Person save(@FormParam("user") String name, @FormParam("lastname") String family,@FormParam("national-code")String nationalCode){
//        return PersonController.save(name,family,nationalCode);
//    }


    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response test(){
        return Response.ok(PersonController.findAll()).build();
    }

}
