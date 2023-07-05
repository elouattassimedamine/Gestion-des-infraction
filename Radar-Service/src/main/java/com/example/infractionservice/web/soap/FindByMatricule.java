
package com.example.infractionservice.web.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour findByMatricule complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="findByMatricule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matricule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findByMatricule", propOrder = {
    "matricule"
})
public class FindByMatricule {

    protected String matricule;

    /**
     * Obtient la valeur de la propriété matricule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Définit la valeur de la propriété matricule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricule(String value) {
        this.matricule = value;
    }

}
