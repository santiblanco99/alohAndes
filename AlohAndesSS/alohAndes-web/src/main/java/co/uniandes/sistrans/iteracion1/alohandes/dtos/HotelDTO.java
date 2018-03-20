/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.alohAndes.dtos;

/**
 * HotelDTO Objeto de transferencia de datos de hoteles. Los DTO contienen las
 * represnetaciones de los JSON que se transfieren entre el cliente y el
 * servidor.
 *
 * Al serializarse como JSON esta clase implementa el siguiente modelo: <br>
 * <pre>
 *   {
 *      "registroCC": boolean,
 *      "registroST": boolean
 *   }
 * </pre>
 * Por ejemplo un hotel se representa asi:<br>
 * 
 * <pre>
 *   {
 *      "registroCC": true,
 *      "registroST": true
 *   }
 *
 * </pre>

/**
 *
 * @author s.blancoc
 */
public class HotelDTO extends OperadorDTO {
    
    private boolean registroCC;
    
    private boolean registroST;
    

    public HotelDTO() {

    }

    /**
     * @return the registroCC
     */
    public boolean isRegistroCC() {
        return registroCC;
    }

    /**
     * @param registroCC the registroCC to set
     */
    public void setRegistroCC(boolean registroCC) {
        this.registroCC = registroCC;
    }

    /**
     * @return the registroST
     */
    public boolean isRegistroST() {
        return registroST;
    }

    /**
     * @param registroST the registroST to set
     */
    public void setRegistroST(boolean registroST) {
        this.registroST = registroST;
    }
    
}
