/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.alohAndes.dtos;

/**
 *
 * @author s.blancoc
 */
public class OperadorDTO {
    
    private String nombre;
    
    private Integer costoBasico;
    
    private String vinculacionU;
    
    private String ubicacion;
    
    private Integer id;
    
    public OperadorDTO(){
        
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
     * @return the costoBasico
     */
    public Integer getCostoBasico() {
        return costoBasico;
    }

    /**
     * @param costoBasico the costoBasico to set
     */
    public void setCostoBasico(Integer costoBasico) {
        this.costoBasico = costoBasico;
    }

    /**
     * @return the vinculacionU
     */
    public String getVinculacionU() {
        return vinculacionU;
    }

    /**
     * @param vinculacionU the vinculacionU to set
     */
    public void setVinculacionU(String vinculacionU) {
        this.vinculacionU = vinculacionU;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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
