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
public class ReservaDTO {
    
    private Integer capacidad;
    
    private Integer tiempo_estadia;
    
    private String fecha_limite;
    
    private String fecha_minima;
    
    private String fecha_llegada;
    
    private Integer precio;
    
    private Integer id;
    
    public ReservaDTO(){
        
    }

    /**
     * @return the capacidad
     */
    public Integer getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
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
     * @return the fecha_limite
     */
    public String getFecha_limite() {
        return fecha_limite;
    }

    /**
     * @param fecha_limite the fecha_limite to set
     */
    public void setFecha_limite(String fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    /**
     * @return the fecha_minima
     */
    public String getFecha_minima() {
        return fecha_minima;
    }

    /**
     * @param fecha_minima the fecha_minima to set
     */
    public void setFecha_minima(String fecha_minima) {
        this.fecha_minima = fecha_minima;
    }

    /**
     * @return the fecha_llegada
     */
    public String getFecha_llegada() {
        return fecha_llegada;
    }

    /**
     * @param fecha_llegada the fecha_llegada to set
     */
    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    /**
     * @return the precio
     */
    public Integer getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Integer precio) {
        this.precio = precio;
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
