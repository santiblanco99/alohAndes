/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.alohAndes.dtos;

import java.util.List;

/**
 *
 * @author s.blancoc
 */
public class PersonaNaturalDetailDTO extends PersonaNaturalDTO{
    
    private List<HabitacionDTO> habitaciones;
    
    private List <ServicioDTO> servicios;
    
    private OfertaDTO oferta;
    
    private List <ContratoDTO> contratos;
    
    public PersonaNaturalDetailDTO(){
        super();
    }

    /**
     * @return the habitaciones
     */
    public List<HabitacionDTO> getHabitaciones() {
        return habitaciones;
    }

    /**
     * @param habitaciones the habitaciones to set
     */
    public void setHabitaciones(List<HabitacionDTO> habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * @return the servicios
     */
    public List <ServicioDTO> getServicios() {
        return servicios;
    }

    /**
     * @param servicios the servicios to set
     */
    public void setServicios(List <ServicioDTO> servicios) {
        this.servicios = servicios;
    }

    /**
     * @return the oferta
     */
    public OfertaDTO getOferta() {
        return oferta;
    }

    /**
     * @param oferta the oferta to set
     */
    public void setOferta(OfertaDTO oferta) {
        this.oferta = oferta;
    }

    /**
     * @return the contratos
     */
    public List <ContratoDTO> getContratos() {
        return contratos;
    }

    /**
     * @param contratos the contratos to set
     */
    public void setContratos(List <ContratoDTO> contratos) {
        this.contratos = contratos;
    }
    
    
}
