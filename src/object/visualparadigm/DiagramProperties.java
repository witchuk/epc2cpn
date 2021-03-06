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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}StringProperty" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}IntegerProperty" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}BooleanProperty" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}DoubleProperty" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}LongProperty" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}ColorProperty" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}ModelRefProperty" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}DiagramRefProperty" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}StringArrayProperty" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visual-paradigm.com/product/vpuml/modelexporter}IntArrayProperty" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stringPropertyOrIntegerPropertyOrBooleanProperty"
})
@XmlRootElement(name = "DiagramProperties")
public class DiagramProperties {

    @XmlElements({
        @XmlElement(name = "StringProperty", type = StringProperty.class),
        @XmlElement(name = "IntegerProperty", type = IntegerProperty.class),
        @XmlElement(name = "BooleanProperty", type = BooleanProperty.class),
        @XmlElement(name = "DoubleProperty", type = DoubleProperty.class),
        @XmlElement(name = "LongProperty", type = LongProperty.class),
        @XmlElement(name = "ColorProperty", type = ColorProperty.class),
        @XmlElement(name = "ModelRefProperty", type = ModelRefProperty.class),
        @XmlElement(name = "DiagramRefProperty", type = DiagramRefProperty.class),
        @XmlElement(name = "StringArrayProperty", type = StringArrayProperty.class),
        @XmlElement(name = "IntArrayProperty", type = IntArrayProperty.class)
    })
    protected List<Property> stringPropertyOrIntegerPropertyOrBooleanProperty;

    /**
     * Gets the value of the stringPropertyOrIntegerPropertyOrBooleanProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringPropertyOrIntegerPropertyOrBooleanProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringPropertyOrIntegerPropertyOrBooleanProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringProperty }
     * {@link IntegerProperty }
     * {@link BooleanProperty }
     * {@link DoubleProperty }
     * {@link LongProperty }
     * {@link ColorProperty }
     * {@link ModelRefProperty }
     * {@link DiagramRefProperty }
     * {@link StringArrayProperty }
     * {@link IntArrayProperty }
     * 
     * 
     */
    public List<Property> getStringPropertyOrIntegerPropertyOrBooleanProperty() {
        if (stringPropertyOrIntegerPropertyOrBooleanProperty == null) {
            stringPropertyOrIntegerPropertyOrBooleanProperty = new ArrayList<Property>();
        }
        return this.stringPropertyOrIntegerPropertyOrBooleanProperty;
    }

}
