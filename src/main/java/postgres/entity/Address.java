
package postgres.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela address
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"address\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Address")
@CronappTable(role=CronappTableRole.AUTO)
public class Address implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Address Id")
    @Column(name = "address_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer addressId;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Address")
    @Column(name = "address", nullable = false, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String address;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Address 2")
    @Column(name = "address2", nullable = true, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String address2;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="city_id", nullable = false, referencedColumnName = "city_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "fk_address_city", foreignKeyDefinition = "FOREIGN KEY (city_id) REFERENCES CITY (city_id)"))
        
        private City city;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="District")
    @Column(name = "district", nullable = false, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String district;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Last Update")
    @Column(name = "last_update", nullable = false, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date lastUpdate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Phone")
    @Column(name = "phone", nullable = false, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String phone;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Postal Code")
    @Column(name = "postal_code", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String postalCode;


    /**
    * Construtor
    * @generated
    */
    public Address(){
    }

    /**
    * Obtém addressId
    * return addressId
    * @generated
    */
    public java.lang.Integer getAddressId() {
        return this.addressId;
    }

    /**
    * Define addressId
    * @param addressId addressId
    * @generated
    */
    public Address setAddressId(java.lang.Integer addressId) {
        this.addressId = addressId;
        return this;
    }
    /**
    * Obtém address
    * return address
    * @generated
    */
    public java.lang.String getAddress() {
        return this.address;
    }

    /**
    * Define address
    * @param address address
    * @generated
    */
    public Address setAddress(java.lang.String address) {
        this.address = address;
        return this;
    }
    /**
    * Obtém address2
    * return address2
    * @generated
    */
    public java.lang.String getAddress2() {
        return this.address2;
    }

    /**
    * Define address2
    * @param address2 address2
    * @generated
    */
    public Address setAddress2(java.lang.String address2) {
        this.address2 = address2;
        return this;
    }
    /**
    * Obtém city
    * return city
    * @generated
    */
    public City getCity() {
        return this.city;
    }

    /**
    * Define city
    * @param city city
    * @generated
    */
    public Address setCity(City city) {
        this.city = city;
        return this;
    }
    /**
    * Obtém district
    * return district
    * @generated
    */
    public java.lang.String getDistrict() {
        return this.district;
    }

    /**
    * Define district
    * @param district district
    * @generated
    */
    public Address setDistrict(java.lang.String district) {
        this.district = district;
        return this;
    }
    /**
    * Obtém lastUpdate
    * return lastUpdate
    * @generated
    */
    public java.util.Date getLastUpdate() {
        return this.lastUpdate;
    }

    /**
    * Define lastUpdate
    * @param lastUpdate lastUpdate
    * @generated
    */
    public Address setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    /**
    * Obtém phone
    * return phone
    * @generated
    */
    public java.lang.String getPhone() {
        return this.phone;
    }

    /**
    * Define phone
    * @param phone phone
    * @generated
    */
    public Address setPhone(java.lang.String phone) {
        this.phone = phone;
        return this;
    }
    /**
    * Obtém postalCode
    * return postalCode
    * @generated
    */
    public java.lang.String getPostalCode() {
        return this.postalCode;
    }

    /**
    * Define postalCode
    * @param postalCode postalCode
    * @generated
    */
    public Address setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Address object = (Address)obj;
        if (addressId != null ? !addressId.equals(object.addressId) : object.addressId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((addressId == null) ? 0 : addressId.hashCode());
        return result;
    }

}
