
package com.hevasoluciones.hsws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertUserUseAppString complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertUserUseAppString">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gendre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlPicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brithdays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertUserUseAppString", propOrder = {
    "idFb",
    "email",
    "fullname",
    "gendre",
    "urlPicture",
    "brithdays"
})
public class InsertUserUseAppString {

    protected String idFb;
    protected String email;
    protected String fullname;
    protected String gendre;
    protected String urlPicture;
    protected String brithdays;

    /**
     * Obtiene el valor de la propiedad idFb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFb() {
        return idFb;
    }

    /**
     * Define el valor de la propiedad idFb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFb(String value) {
        this.idFb = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad fullname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Define el valor de la propiedad fullname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

    /**
     * Obtiene el valor de la propiedad gendre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGendre() {
        return gendre;
    }

    /**
     * Define el valor de la propiedad gendre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGendre(String value) {
        this.gendre = value;
    }

    /**
     * Obtiene el valor de la propiedad urlPicture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPicture() {
        return urlPicture;
    }

    /**
     * Define el valor de la propiedad urlPicture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPicture(String value) {
        this.urlPicture = value;
    }

    /**
     * Obtiene el valor de la propiedad brithdays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrithdays() {
        return brithdays;
    }

    /**
     * Define el valor de la propiedad brithdays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrithdays(String value) {
        this.brithdays = value;
    }

}
