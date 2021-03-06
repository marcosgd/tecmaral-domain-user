//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-322 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.12 at 10:22:19 AM CEST 
//


package com.tecmaral.domain.user.comun.datoscontacto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poblacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Escalera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Portal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Puerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sexo",
    "fechaNacimiento",
    "nacionalidad",
    "profesion",
    "tipoVia",
    "nombreVia",
    "numeroVia",
    "poblacion",
    "provincia",
    "codPostal",
    "pais",
    "escalera",
    "bloque",
    "portal",
    "piso",
    "puerta",
    "telefono",
    "email"
})
public class DatosAdicionalesContacto
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Sexo", namespace = "datoscontacto.tecmaral.es")
    protected String sexo;
    @XmlElement(name = "FechaNacimiento", namespace = "datoscontacto.tecmaral.es")
    protected String fechaNacimiento;
    @XmlElement(name = "Nacionalidad", namespace = "datoscontacto.tecmaral.es")
    protected String nacionalidad;
    @XmlElement(name = "Profesion", namespace = "datoscontacto.tecmaral.es")
    protected String profesion;
    @XmlElement(name = "TipoVia", namespace = "datoscontacto.tecmaral.es")
    protected String tipoVia;
    @XmlElement(name = "NombreVia", namespace = "datoscontacto.tecmaral.es")
    protected String nombreVia;
    @XmlElement(name = "NumeroVia", namespace = "datoscontacto.tecmaral.es")
    protected String numeroVia;
    @XmlElement(name = "Poblacion", namespace = "datoscontacto.tecmaral.es")
    protected String poblacion;
    @XmlElement(name = "Provincia", namespace = "datoscontacto.tecmaral.es")
    protected String provincia;
    @XmlElement(name = "CodPostal", namespace = "datoscontacto.tecmaral.es")
    protected String codPostal;
    @XmlElement(name = "Pais", namespace = "datoscontacto.tecmaral.es")
    protected String pais;
    @XmlElement(name = "Escalera", namespace = "datoscontacto.tecmaral.es")
    protected String escalera;
    @XmlElement(name = "Bloque", namespace = "datoscontacto.tecmaral.es")
    protected String bloque;
    @XmlElement(name = "Portal", namespace = "datoscontacto.tecmaral.es")
    protected String portal;
    @XmlElement(name = "Piso", namespace = "datoscontacto.tecmaral.es")
    protected String piso;
    @XmlElement(name = "Puerta", namespace = "datoscontacto.tecmaral.es")
    protected String puerta;
    @XmlElement(name = "Telefono", namespace = "datoscontacto.tecmaral.es")
    protected String telefono;
    @XmlElement(name = "Email", namespace = "datoscontacto.tecmaral.es")
    protected String email;

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the nacionalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Sets the value of the nacionalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

    /**
     * Gets the value of the profesion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Sets the value of the profesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfesion(String value) {
        this.profesion = value;
    }

    /**
     * Gets the value of the tipoVia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVia() {
        return tipoVia;
    }

    /**
     * Sets the value of the tipoVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVia(String value) {
        this.tipoVia = value;
    }

    /**
     * Gets the value of the nombreVia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreVia() {
        return nombreVia;
    }

    /**
     * Sets the value of the nombreVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreVia(String value) {
        this.nombreVia = value;
    }

    /**
     * Gets the value of the numeroVia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroVia() {
        return numeroVia;
    }

    /**
     * Sets the value of the numeroVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroVia(String value) {
        this.numeroVia = value;
    }

    /**
     * Gets the value of the poblacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Sets the value of the poblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoblacion(String value) {
        this.poblacion = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the codPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Sets the value of the codPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostal(String value) {
        this.codPostal = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the escalera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalera() {
        return escalera;
    }

    /**
     * Sets the value of the escalera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalera(String value) {
        this.escalera = value;
    }

    /**
     * Gets the value of the bloque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloque() {
        return bloque;
    }

    /**
     * Sets the value of the bloque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloque(String value) {
        this.bloque = value;
    }

    /**
     * Gets the value of the portal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortal() {
        return portal;
    }

    /**
     * Sets the value of the portal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortal(String value) {
        this.portal = value;
    }

    /**
     * Gets the value of the piso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Sets the value of the piso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Gets the value of the puerta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuerta() {
        return puerta;
    }

    /**
     * Sets the value of the puerta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuerta(String value) {
        this.puerta = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the email property.
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
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
