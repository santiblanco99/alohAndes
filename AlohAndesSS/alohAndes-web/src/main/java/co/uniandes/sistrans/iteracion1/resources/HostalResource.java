/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.resources;

import co.uniandes.sistrans.iteracion1.alohAndes.dtos.HostalDTO;
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

/**
 *
 * @author s.blancoc
 */
@Path("hostales")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class HostalResource {
    
    @GET
    public List<HostalDTO> getHostales(){
        return new ArrayList<>();
    }
    
    @GET
    @Path("{id: \\d+}")
    public HostalDTO getHostal(@PathParam("id") Integer id)  {
        
        return null;
    }
    
    @POST
    public HostalDTO createHostal(HostalDTO Hostal) {
        return null;
    }
    
    @PUT
    @Path("{id: \\d+}")
    public HostalDTO updateHostal(@PathParam("id") Integer id, HostalDTO Hostal) {
        return null;

    }
    
    @DELETE
    @Path("{id: \\d+}")
    public void deleteHostal(@PathParam("id") Integer id) {
    
    }
    
}
