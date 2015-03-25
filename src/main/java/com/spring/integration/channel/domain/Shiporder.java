//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.27 at 10:39:30 PM CDT 
//

package com.spring.integration.channel.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p/>
 * Java class for anonymous complex type.
 * <p/>
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderperson" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="item" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="orderid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"orderperson", "shipto", "item"})
@XmlRootElement(name = "shiporder")
public class Shiporder {

    @XmlElement(required = true)
    protected String orderperson;
    @XmlElement(required = true)
    protected Shipto shipto;
    @XmlElement(required = true)
    protected List<Item> item;
    @XmlAttribute(name = "orderid", required = true)
    protected String orderid;

    /**
     * Gets the value of the orderperson property.
     *
     * @return possible object is {@link String }
     */
    public String getOrderperson() {
        return orderperson;
    }

    /**
     * Sets the value of the orderperson property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOrderperson(String value) {
        this.orderperson = value;
    }

    /**
     * Gets the value of the shipto property.
     *
     * @return possible object is {@link com.spring.integration.channel.domain.Shiporder.Shipto }
     */
    public Shipto getShipto() {
        return shipto;
    }

    /**
     * Sets the value of the shipto property.
     *
     * @param value allowed object is {@link com.spring.integration.channel.domain.Shiporder.Shipto }
     */
    public void setShipto(Shipto value) {
        this.shipto = value;
    }

    /**
     * Gets the value of the item property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the item property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <p/>
     * <pre>
     * getItem().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link com.spring.integration.channel.domain.Shiporder.Item }
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the orderid property.
     *
     * @return possible object is {@link String }
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOrderid(String value) {
        this.orderid = value;
    }

    /**
     * <p/>
     * Java class for anonymous complex type.
     * <p/>
     * <p/>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"title", "note", "quantity", "price"})
    public static class Item {

        @XmlElement(required = true)
        protected String title;
        protected String note;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger quantity;
        @XmlElement(required = true)
        protected BigDecimal price;

        /**
         * Gets the value of the title property.
         *
         * @return possible object is {@link String }
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         *
         * @param value allowed object is {@link String }
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the note property.
         *
         * @return possible object is {@link String }
         */
        public String getNote() {
            return note;
        }

        /**
         * Sets the value of the note property.
         *
         * @param value allowed object is {@link String }
         */
        public void setNote(String value) {
            this.note = value;
        }

        /**
         * Gets the value of the quantity property.
         *
         * @return possible object is {@link java.math.BigInteger }
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         *
         * @param value allowed object is {@link java.math.BigInteger }
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the price property.
         *
         * @return possible object is {@link java.math.BigDecimal }
         */
        public BigDecimal getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         *
         * @param value allowed object is {@link java.math.BigDecimal }
         */
        public void setPrice(BigDecimal value) {
            this.price = value;
        }

        @Override
        public String toString() {
            return "Item [title=" + title + ", note=" + note + ", quantity="
                    + quantity + ", price=" + price + "]";
        }

    }

    /**
     * <p/>
     * Java class for anonymous complex type.
     * <p/>
     * <p/>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"name", "address", "city", "country"})
    public static class Shipto {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String address;
        @XmlElement(required = true)
        protected String city;
        @XmlElement(required = true)
        protected String country;

        /**
         * Gets the value of the name property.
         *
         * @return possible object is {@link String }
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value allowed object is {@link String }
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the address property.
         *
         * @return possible object is {@link String }
         */
        public String getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         *
         * @param value allowed object is {@link String }
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the city property.
         *
         * @return possible object is {@link String }
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         *
         * @param value allowed object is {@link String }
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the country property.
         *
         * @return possible object is {@link String }
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         *
         * @param value allowed object is {@link String }
         */
        public void setCountry(String value) {
            this.country = value;
        }

        @Override
        public String toString() {
            return "Shipto [name=" + name + ", address=" + address + ", city="
                    + city + ", country=" + country + "]";
        }

    }

    @Override
    public String toString() {
        return "Shiporder [orderperson=" + orderperson + ", shipto=" + shipto
                + ", item=" + item + ", orderid=" + orderid + "]";
    }

}
