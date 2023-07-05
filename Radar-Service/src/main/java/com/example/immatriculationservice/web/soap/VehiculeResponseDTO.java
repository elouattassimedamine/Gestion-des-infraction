
package com.example.immatriculationservice.web.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour vehiculeResponseDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="vehiculeResponseDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresse_Personne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cv_Vehicule" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_Personne" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id_Vehicule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="mail_Personne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marque_Vehicule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matricule_Vehicule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modele_Vehicule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="naissance_Personne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nom_Personne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehiculeResponseDTO", propOrder = {
    "adressePersonne",
    "cvVehicule",
    "idPersonne",
    "idVehicule",
    "mailPersonne",
    "marqueVehicule",
    "matriculeVehicule",
    "modeleVehicule",
    "naissancePersonne",
    "nomPersonne"
})
public class VehiculeResponseDTO {

    @XmlElement(name = "adresse_Personne")
    protected String adressePersonne;
    @XmlElement(name = "cv_Vehicule")
    protected int cvVehicule;
    @XmlElement(name = "id_Personne")
    protected Long idPersonne;
    @XmlElement(name = "id_Vehicule")
    protected Long idVehicule;
    @XmlElement(name = "mail_Personne")
    protected String mailPersonne;
    @XmlElement(name = "marque_Vehicule")
    protected String marqueVehicule;
    @XmlElement(name = "matricule_Vehicule")
    protected String matriculeVehicule;
    @XmlElement(name = "modele_Vehicule")
    protected String modeleVehicule;
    @XmlElement(name = "naissance_Personne")
    protected String naissancePersonne;
    @XmlElement(name = "nom_Personne")
    protected String nomPersonne;

    /**
     * Obtient la valeur de la propriété adressePersonne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressePersonne() {
        return adressePersonne;
    }

    /**
     * Définit la valeur de la propriété adressePersonne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressePersonne(String value) {
        this.adressePersonne = value;
    }

    /**
     * Obtient la valeur de la propriété cvVehicule.
     * 
     */
    public int getCvVehicule() {
        return cvVehicule;
    }

    /**
     * Définit la valeur de la propriété cvVehicule.
     * 
     */
    public void setCvVehicule(int value) {
        this.cvVehicule = value;
    }

    /**
     * Obtient la valeur de la propriété idPersonne.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPersonne() {
        return idPersonne;
    }

    /**
     * Définit la valeur de la propriété idPersonne.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPersonne(Long value) {
        this.idPersonne = value;
    }

    /**
     * Obtient la valeur de la propriété idVehicule.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVehicule() {
        return idVehicule;
    }

    /**
     * Définit la valeur de la propriété idVehicule.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVehicule(Long value) {
        this.idVehicule = value;
    }

    /**
     * Obtient la valeur de la propriété mailPersonne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailPersonne() {
        return mailPersonne;
    }

    /**
     * Définit la valeur de la propriété mailPersonne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailPersonne(String value) {
        this.mailPersonne = value;
    }

    /**
     * Obtient la valeur de la propriété marqueVehicule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarqueVehicule() {
        return marqueVehicule;
    }

    /**
     * Définit la valeur de la propriété marqueVehicule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarqueVehicule(String value) {
        this.marqueVehicule = value;
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
     * Obtient la valeur de la propriété modeleVehicule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeleVehicule() {
        return modeleVehicule;
    }

    /**
     * Définit la valeur de la propriété modeleVehicule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeleVehicule(String value) {
        this.modeleVehicule = value;
    }

    /**
     * Obtient la valeur de la propriété naissancePersonne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaissancePersonne() {
        return naissancePersonne;
    }

    /**
     * Définit la valeur de la propriété naissancePersonne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaissancePersonne(String value) {
        this.naissancePersonne = value;
    }

    /**
     * Obtient la valeur de la propriété nomPersonne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomPersonne() {
        return nomPersonne;
    }

    /**
     * Définit la valeur de la propriété nomPersonne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomPersonne(String value) {
        this.nomPersonne = value;
    }

}
