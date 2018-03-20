/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.resources;

import co.uniandes.sistrans.iteracion1.alohAndes.dtos.HabitacionDetailDTO;
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
@Path("operadores/{id_operador: \\d+}/habitaciones")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class HabitacionResource {
    
    @POST
    public HabitacionDetailDTO createHabitacion(@PathParam("id_operador") Integer id_operador,HabitacionDetailDTO habitacion){
        return null;
    } 
    
    @GET
    public List<HabitacionDetailDTO> getHabitacionesOperadores(@PathParam("id_operador") Integer id_operador){
        return new ArrayList<>();
    }
    
    @GET
    @Path("{id: \\d+}")
    public HabitacionDetailDTO getHabitacion(@PathParam("id_operador") Integer id_operador,@PathParam("id") Integer id){
        return null;
    }
    
    @PUT
    @Path("{id: \\d+}")
    public HabitacionDetailDTO updateHabitacion(@PathParam("id_operador") Integer id_operador,@PathParam("id") Integer id){
        return null;
    }
    
    @DELETE
    @Path("{id: \\d+}")
    public void deleteHabitacion(@PathParam("id_operador") Integer id_operador,@PathParam("id") Integer id){
        
    }
    @DELETE
    public void deleteHabitacionES(@PathParam("id_operador") Integer id_operador){
        
    }
}
