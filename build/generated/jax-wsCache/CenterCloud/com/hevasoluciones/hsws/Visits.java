
package com.hevasoluciones.hsws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para visits complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="visits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="app_in_background_visits" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="app_in_foreground_visits" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total_visits" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visits", propOrder = {
    "appInBackgroundVisits",
    "appInForegroundVisits",
    "time",
    "totalVisits"
})
public class Visits {

    @XmlElement(name = "app_in_background_visits")
    protected long appInBackgroundVisits;
    @XmlElement(name = "app_in_foreground_visits")
    protected long appInForegroundVisits;
    protected String time;
    @XmlElement(name = "total_visits")
    protected long totalVisits;

    /**
     * Obtiene el valor de la propiedad appInBackgroundVisits.
     * 
     */
    public long getAppInBackgroundVisits() {
        return appInBackgroundVisits;
    }

    /**
     * Define el valor de la propiedad appInBackgroundVisits.
     * 
     */
    public void setAppInBackgroundVisits(long value) {
        this.appInBackgroundVisits = value;
    }

    /**
     * Obtiene el valor de la propiedad appInForegroundVisits.
     * 
     */
    public long getAppInForegroundVisits() {
        return appInForegroundVisits;
    }

    /**
     * Define el valor de la propiedad appInForegroundVisits.
     * 
     */
    public void setAppInForegroundVisits(long value) {
        this.appInForegroundVisits = value;
    }

    /**
     * Obtiene el valor de la propiedad time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Obtiene el valor de la propiedad totalVisits.
     * 
     */
    public long getTotalVisits() {
        return totalVisits;
    }

    /**
     * Define el valor de la propiedad totalVisits.
     * 
     */
    public void setTotalVisits(long value) {
        this.totalVisits = value;
    }

}
