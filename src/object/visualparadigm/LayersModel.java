//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.17 at 08:40:10 PM ICT 
//


package object.visualparadigm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Layer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="defaultLayerId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="activeLayerId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "layer"
})
@XmlRootElement(name = "LayersModel")
public class LayersModel {

    @XmlElement(name = "Layer")
    protected List<LayersModel.Layer> layer;
    @XmlAttribute(name = "defaultLayerId")
    protected String defaultLayerId;
    @XmlAttribute(name = "activeLayerId")
    protected String activeLayerId;

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayersModel.Layer }
     * 
     * 
     */
    public List<LayersModel.Layer> getLayer() {
        if (layer == null) {
            layer = new ArrayList<LayersModel.Layer>();
        }
        return this.layer;
    }

    /**
     * Gets the value of the defaultLayerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLayerId() {
        return defaultLayerId;
    }

    /**
     * Sets the value of the defaultLayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLayerId(String value) {
        this.defaultLayerId = value;
    }

    /**
     * Gets the value of the activeLayerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveLayerId() {
        return activeLayerId;
    }

    /**
     * Sets the value of the activeLayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveLayerId(String value) {
        this.activeLayerId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Layer {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "visible")
        protected String visible;
        @XmlAttribute(name = "locked")
        protected String locked;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the visible property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVisible() {
            return visible;
        }

        /**
         * Sets the value of the visible property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVisible(String value) {
            this.visible = value;
        }

        /**
         * Gets the value of the locked property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocked() {
            return locked;
        }

        /**
         * Sets the value of the locked property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocked(String value) {
            this.locked = value;
        }

    }

}
