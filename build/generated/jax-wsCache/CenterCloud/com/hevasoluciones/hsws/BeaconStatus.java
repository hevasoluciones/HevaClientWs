
package com.hevasoluciones.hsws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beaconStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beaconStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countBeaconAlert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="countBeaconOff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="countBeaconOn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beaconStatus", propOrder = {
    "countBeaconAlert",
    "countBeaconOff",
    "countBeaconOn"
})
public class BeaconStatus {

    protected int countBeaconAlert;
    protected int countBeaconOff;
    protected int countBeaconOn;

    /**
     * Obtiene el valor de la propiedad countBeaconAlert.
     * 
     */
    public int getCountBeaconAlert() {
        return countBeaconAlert;
    }

    /**
     * Define el valor de la propiedad countBeaconAlert.
     * 
     */
    public void setCountBeaconAlert(int value) {
        this.countBeaconAlert = value;
    }

    /**
     * Obtiene el valor de la propiedad countBeaconOff.
     * 
     */
    public int getCountBeaconOff() {
        return countBeaconOff;
    }

    /**
     * Define el valor de la propiedad countBeaconOff.
     * 
     */
    public void setCountBeaconOff(int value) {
        this.countBeaconOff = value;
    }

    /**
     * Obtiene el valor de la propiedad countBeaconOn.
     * 
     */
    public int getCountBeaconOn() {
        return countBeaconOn;
    }

    /**
     * Define el valor de la propiedad countBeaconOn.
     * 
     */
    public void setCountBeaconOn(int value) {
        this.countBeaconOn = value;
    }

}
