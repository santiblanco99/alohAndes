/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.resources;

import co.uniandes.sistrans.iteracion1.alohAndes.dtos.ClienteDetailDTO;
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
 * @author sa.yepes
 */
@Path("clientes")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class ClienteResource {
    @POST
    public ClienteDetailDTO createCliente(ClienteDetailDTO cliente){
        return null;
    }
    
    @GET
    public List<ClienteDetailDTO> getClientes(){
        return new ArrayList<>();
    }
    
    @GET
    @Path("{id: \\d+}")
    public ClienteDetailDTO getClientes(@PathParam("id") Long id){
        return null;
    }

    @PUT
    @Path("{id: \\d+}")
    public ClienteDetailDTO updateCliente(@PathParam("id") Long id, ClienteDetailDTO cliente){
        return null;
    }
    
    @DELETE
    @Path("{id: \\d+}")
    public void deleteCliente(@PathParam("id") Long id){
        
    }
}
