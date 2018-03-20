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
public class ReservaDetailDTO extends ReservaDTO{
    
    private ClienteDTO cliente;
    
    private OfertaDTO oferta;
    
    public ReservaDetailDTO(){
        
    }

    /**
     * @return the cliente
     */
    public ClienteDTO getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
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
}
