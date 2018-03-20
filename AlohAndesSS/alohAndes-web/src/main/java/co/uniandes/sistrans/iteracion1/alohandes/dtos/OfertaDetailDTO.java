/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.alohAndes.dtos;

import java.util.List;

/**
 *
 * @author sa.yepes
 */
public class OfertaDetailDTO extends OfertaDTO{
    
    private List<ReservaDTO> reservas;
    
    private OperadorDTO operador;
    
    public OfertaDetailDTO(){
        
    }

    /**
     * @return the reservas
     */
    public List<ReservaDTO> getReservas() {
        return reservas;
    }

    /**
     * @param reservas the reservas to set
     */
    public void setReservas(List<ReservaDTO> reservas) {
        this.reservas = reservas;
    }

    /**
     * @return the operador
     */
    public OperadorDTO getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(OperadorDTO operador) {
        this.operador = operador;
    }
}
