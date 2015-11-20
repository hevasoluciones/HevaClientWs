
package com.hevasoluciones.hsws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCampains complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCampains">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Beacons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCampains", propOrder = {
    "beacons"
})
public class GetCampains {

    @XmlElement(name = "Beacons")
    protected String beacons;

    /**
     * Obtiene el valor de la propiedad beacons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeacons() {
        return beacons;
    }

    /**
     * Define el valor de la propiedad beacons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeacons(String value) {
        this.beacons = value;
    }

}
