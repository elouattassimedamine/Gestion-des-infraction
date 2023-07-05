
package com.example.immatriculationservice.web.soap;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.immatriculationservice.web.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindAll_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "findAllResponse");
    private final static QName _FindById_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "findByIdResponse");
    private final static QName _FindByMatricule_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "findByMatricule");
    private final static QName _FindByMatriculeResponse_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "findByMatriculeResponse");
    private final static QName _Save_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "save");
    private final static QName _SaveResponse_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "saveResponse");
    private final static QName _Update_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://SOAP.Web.immatriculationservice.example.com/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.immatriculationservice.web.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindById }
     * 
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link FindByIdResponse }
     * 
     */
    public FindByIdResponse createFindByIdResponse() {
        return new FindByIdResponse();
    }

    /**
     * Create an instance of {@link FindByMatricule }
     * 
     */
    public FindByMatricule createFindByMatricule() {
        return new FindByMatricule();
    }

    /**
     * Create an instance of {@link FindByMatriculeResponse }
     * 
     */
    public FindByMatriculeResponse createFindByMatriculeResponse() {
        return new FindByMatriculeResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link VehiculeResponseDTO }
     * 
     */
    public VehiculeResponseDTO createVehiculeResponseDTO() {
        return new VehiculeResponseDTO();
    }

    /**
     * Create an instance of {@link VehiculeRequestDTO }
     * 
     */
    public VehiculeRequestDTO createVehiculeRequestDTO() {
        return new VehiculeRequestDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByMatricule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByMatricule }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "findByMatricule")
    public JAXBElement<FindByMatricule> createFindByMatricule(FindByMatricule value) {
        return new JAXBElement<FindByMatricule>(_FindByMatricule_QNAME, FindByMatricule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByMatriculeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByMatriculeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "findByMatriculeResponse")
    public JAXBElement<FindByMatriculeResponse> createFindByMatriculeResponse(FindByMatriculeResponse value) {
        return new JAXBElement<FindByMatriculeResponse>(_FindByMatriculeResponse_QNAME, FindByMatriculeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.Web.immatriculationservice.example.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
