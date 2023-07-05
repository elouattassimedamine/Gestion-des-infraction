
package com.example.infractionservice.web.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour infractionResponseDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="infractionResponseDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date_Infraction" type="{http://SOAP.Web.infractionservice.example.com/}date" minOccurs="0"/&gt;
 *         &lt;element name="id_Infraction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id_Radar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="matricule_Vehicule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montant_Infraction" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vitesse_Radar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vitesse_Vehicule" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infractionResponseDTO", propOrder = {
    "dateInfraction",
    "idInfraction",
    "idRadar",
    "matriculeVehicule",
    "montantInfraction",
    "vitesseRadar",
    "vitesseVehicule"
})
public class InfractionResponseDTO {

    @XmlElement(name = "date_Infraction")
    protected Date dateInfraction;
    @XmlElement(name = "id_Infraction")
    protected Long idInfraction;
    @XmlElement(name = "id_Radar")
    protected Long idRadar;
    @XmlElement(name = "matricule_Vehicule")
    protected String matriculeVehicule;
    @XmlElement(name = "montant_Infraction")
    protected int montantInfraction;
    @XmlElement(name = "vitesse_Radar")
    protected int vitesseRadar;
    @XmlElement(name = "vitesse_Vehicule")
    protected int vitesseVehicule;

    /**
     * Obtient la valeur de la propriété dateInfraction.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateInfraction() {
        return dateInfraction;
    }

    /**
     * Définit la valeur de la propriété dateInfraction.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateInfraction(Date value) {
        this.dateInfraction = value;
    }

    /**
     * Obtient la valeur de la propriété idInfraction.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInfraction() {
        return idInfraction;
    }

    /**
     * Définit la valeur de la propriété idInfraction.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInfraction(Long value) {
        this.idInfraction = value;
    }

    /**
     * Obtient la valeur de la propriété idRadar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdRadar() {
        return idRadar;
    }

    /**
     * Définit la valeur de la propriété idRadar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdRadar(Long value) {
        this.idRadar = value;
    }

    /**
     * Obtient la valeur de la propriété matriculeVehicule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculeVehicule() {
        return matriculeVehicule;
    }

    /**
     * Définit la valeur de la propriété matriculeVehicule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculeVehicule(String value) {
        this.matriculeVehicule = value;
    }

    /**
     * Obtient la valeur de la propriété montantInfraction.
     * 
     */
    public int getMontantInfraction() {
        return montantInfraction;
    }

    /**
     * Définit la valeur de la propriété montantInfraction.
     * 
     */
    public void setMontantInfraction(int value) {
        this.montantInfraction = value;
    }

    /**
     * Obtient la valeur de la propriété vitesseRadar.
     * 
     */
    public int getVitesseRadar() {
        return vitesseRadar;
    }

    /**
     * Définit la valeur de la propriété vitesseRadar.
     * 
     */
    public void setVitesseRadar(int value) {
        this.vitesseRadar = value;
    }

    /**
     * Obtient la valeur de la propriété vitesseVehicule.
     * 
     */
    public int getVitesseVehicule() {
        return vitesseVehicule;
    }

    /**
     * Définit la valeur de la propriété vitesseVehicule.
     * 
     */
    public void setVitesseVehicule(int value) {
        this.vitesseVehicule = value;
    }

}
