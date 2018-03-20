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
public class ContratoDTO {
    
    private Integer precio_final;
    
    private Integer tiempo_estadia;
    
    private Integer id;
    
    public ContratoDTO(){
        
    }

    /**
     * @return the precio_final
     */
    public Integer getPrecio_final() {
        return precio_final;
    }

    /**
     * @param precio_final the precio_final to set
     */
    public void setPrecio_final(Integer precio_final) {
        this.precio_final = precio_final;
    }

    /**
     * @return the tiempo_estadia
     */
    public Integer getTiempo_estadia() {
        return tiempo_estadia;
    }

    /**
     * @param tiempo_estadia the tiempo_estadia to set
     */
    public void setTiempo_estadia(Integer tiempo_estadia) {
        this.tiempo_estadia = tiempo_estadia;
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
