
package com.hevasoluciones.hsws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para uniqueVisitorsforRegionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="uniqueVisitorsforRegionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://hsws.hevasoluciones.com/}visitsRegionSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uniqueVisitorsforRegionResponse", propOrder = {
    "_return"
})
public class UniqueVisitorsforRegionResponse {

    @XmlElement(name = "return")
    protected VisitsRegionSpec _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link VisitsRegionSpec }
     *     
     */
    public VisitsRegionSpec getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link VisitsRegionSpec }
     *     
     */
    public void setReturn(VisitsRegionSpec value) {
        this._return = value;
    }

}
