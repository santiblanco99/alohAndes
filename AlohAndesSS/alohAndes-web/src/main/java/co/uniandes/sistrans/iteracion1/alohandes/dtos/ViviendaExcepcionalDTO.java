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
public class ViviendaExcepcionalDTO {
    
    private Integer numHabitaciones;
    
    private String menaje;
    
    private String seguro;
    
    private Integer numDiasPrestada;
    
    public ViviendaExcepcionalDTO(){
        
    }

    /**
     * @return the numHabitaciones
     */
    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the menaje
     */
    public String getMenaje() {
        return menaje;
    }

    /**
     * @param menaje the menaje to set
     */
    public void setMenaje(String menaje) {
        this.menaje = menaje;
    }

    /**
     * @return the seguro
     */
    public String getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the numDiasPrestada
     */
    public Integer getNumDiasPrestada() {
        return numDiasPrestada;
    }

    /**
     * @param numDiasPrestada the numDiasPrestada to set
     */
    public void setNumDiasPrestada(Integer numDiasPrestada) {
        this.numDiasPrestada = numDiasPrestada;
    }
    
    
    
}
