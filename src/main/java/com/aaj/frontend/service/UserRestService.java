/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aaj.frontend.service;

import com.aaj.frontend.bu.UserManager;   
import com.aaj.frontend.domain.User; 
import java.util.List; 
import javax.ws.rs.Consumes; 
import javax.ws.rs.DELETE; 
import javax.ws.rs.GET; 
import javax.ws.rs.POST; 
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.GenericEntity; 
import javax.ws.rs.core.MediaType;   
import javax.ws.rs.core.Response;   
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Component; 

/**
 *
 * @author luisb
 */
@Component 
@Path("/users") 
public class UserRestService {
    
    @Autowired 
    private UserManager userManager;   
    
    @Path("/") 
    @GET 
    @Produces("application/json")
    public Response getUsersXML() { 
        List<User> users = userManager.getAll(); 
        GenericEntity<List<User>> ge = new GenericEntity<List<User>>(users){}; 
        return Response.ok(ge).build(); }   
    
    @Path("/{id}") 
    @GET 
    public Response getUserXMLById(@PathParam("id") Integer id) { 
        User user = userManager.getById(id); 
        return Response.ok(user).build(); 
    }   
    
    @Path("/") 
    @POST 
    public Response saveUser(User user) { 
        userManager.save(user); 
        return Response.ok("<status>success</status>").build(); 
    }   
    
    @Path("/{id}") 
    @DELETE 
    public Response deleteUser(@PathParam("id") Integer id) { 
        userManager.delete(id); 
        return Response.ok("<status>success</status>").build(); 
    }
}
