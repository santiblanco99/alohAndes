/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.resources;

import co.uniandes.sistrans.iteracion1.alohAndes.dtos.OperadorDTO;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author s.blancoc
 */
@Path("operadores")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class OperadorResource {
    
    @GET
    public List<OperadorDTO> getOperadores(){
        return new ArrayList<>();
    }
    
    @GET
    @Path("{id: \\d+}")
    public OperadorDTO getOperador(@PathParam("id") Integer id) {
        
        return null;
    }
    
    @POST
    public OperadorDTO createOperador(OperadorDTO operador) {
        return null;
    }
    
    @PUT
    @Path("{id: \\d+}")
    public OperadorDTO updateOperador(@PathParam("id") Integer id, OperadorDTO operador) {
        return null;

    }
    
    @DELETE
    @Path("{id: \\d+}")
    public void deleteOperador(@PathParam("id") Integer id) {
    
    }
    
    
    
}
