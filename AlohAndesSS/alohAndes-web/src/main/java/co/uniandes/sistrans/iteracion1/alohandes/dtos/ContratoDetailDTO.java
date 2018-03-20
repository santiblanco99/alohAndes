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
public class ContratoDetailDTO extends ContratoDTO {

    private OperadorDTO operador;

    private ClienteDTO cliente;

    public ContratoDetailDTO() {

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
}
