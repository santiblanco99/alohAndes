/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.alohAndes.dtos;

/**
 *
 * @author sa.yepes
 */
public class ClienteDTO {
    
    private String vinculacion_u;
    
    private String nombre;
    
    private Long doc;
    
    private Integer id;
    
    public ClienteDTO(){
        
    }

    /**
     * @return the vinculacion_u
     */
    public String getVinculacion_u() {
        return vinculacion_u;
    }

    /**
     * @param vinculacion_u the vinculacion_u to set
     */
    public void setVinculacion_u(String vinculacion_u) {
        this.vinculacion_u = vinculacion_u;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the doc
     */
    public Long getDoc() {
        return doc;
    }

    /**
     * @param doc the doc to set
     */
    public void setDoc(Long doc) {
        this.doc = doc;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
