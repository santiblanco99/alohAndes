/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniandes.sistrans.iteracion1.alohAndes.dtos;

/**
 * HostallDTO Objeto de transferencia de datos de hostales. Los DTO contienen las
 * represnetaciones de los JSON que se transfieren entre el cliente y el
 * servidor.
 *
 * Al serializarse como JSON esta clase implementa el siguiente modelo: <br>
 * <pre>
 *   {
 *      "horarioApertura": string,
 *      "horarioCierre": string
 *   }
 * </pre>
 * Por ejemplo un hostal se representa asi:<br>
 * 
 * <pre>
 *   {
 *      "horarioApertura": "3:00 pm",
 *      "horarioCierre": "4:00 pm"
 *   }
 *
 * </pre>

/**
 *
 * @author s.blancoc
 */
public class HostalDTO extends HotelDTO {
    
    private String horarioApertura;
    
    private String horarioCierre;
    
    public HostalDTO(){
        
    }

    /**
     * @return the horarioApertura
     */
    public String getHorarioApertura() {
        return horarioApertura;
    }

    /**
     * @param horarioApertura the horarioApertura to set
     */
    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    /**
     * @return the horarioCierre
     */
    public String getHorarioCierre() {
        return horarioCierre;
    }

    /**
     * @param horarioCierre the horarioCierre to set
     */
    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }
    
    
    
    
    
}
