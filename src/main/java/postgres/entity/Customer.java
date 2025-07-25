
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
* Classe que representa a tabela customer
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"customer\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Customer")
@CronappTable(role=CronappTableRole.AUTO)
public class Customer implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Customer Id")
    @Column(name = "customer_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer customerId;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Active")
    @Column(name = "active", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer active;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Activebool")
    @Column(name = "activebool", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean activebool;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="address_id", nullable = false, referencedColumnName = "address_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "customer_address_id_fkey", foreignKeyDefinition = "FOREIGN KEY (address_id) REFERENCES ADDRESS (address_id)"))
        
        private Address address;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Create Date")
    @Column(name = "create_date", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date createDate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Email")
    @Column(name = "email", nullable = true, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String email;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="First Name")
    @Column(name = "first_name", nullable = false, unique = false, length=45, insertable=true, updatable=true)
        
        private java.lang.String firstName;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Last Name")
    @Column(name = "last_name", nullable = false, unique = false, length=45, insertable=true, updatable=true)
        
        private java.lang.String lastName;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Last Update")
    @Column(name = "last_update", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date lastUpdate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="SHORT", label="Store Id")
    @Column(name = "store_id", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short storeId;


    /**
    * Construtor
    * @generated
    */
    public Customer(){
    }

    /**
    * Obtém customerId
    * return customerId
    * @generated
    */
    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    /**
    * Define customerId
    * @param customerId customerId
    * @generated
    */
    public Customer setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
        return this;
    }
    /**
    * Obtém active
    * return active
    * @generated
    */
    public java.lang.Integer getActive() {
        return this.active;
    }

    /**
    * Define active
    * @param active active
    * @generated
    */
    public Customer setActive(java.lang.Integer active) {
        this.active = active;
        return this;
    }
    /**
    * Obtém activebool
    * return activebool
    * @generated
    */
    public java.lang.Boolean getActivebool() {
        return this.activebool;
    }

    /**
    * Define activebool
    * @param activebool activebool
    * @generated
    */
    public Customer setActivebool(java.lang.Boolean activebool) {
        this.activebool = activebool;
        return this;
    }
    /**
    * Obtém address
    * return address
    * @generated
    */
    public Address getAddress() {
        return this.address;
    }

    /**
    * Define address
    * @param address address
    * @generated
    */
    public Customer setAddress(Address address) {
        this.address = address;
        return this;
    }
    /**
    * Obtém createDate
    * return createDate
    * @generated
    */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
    * Define createDate
    * @param createDate createDate
    * @generated
    */
    public Customer setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public Customer setEmail(java.lang.String email) {
        this.email = email;
        return this;
    }
    /**
    * Obtém firstName
    * return firstName
    * @generated
    */
    public java.lang.String getFirstName() {
        return this.firstName;
    }

    /**
    * Define firstName
    * @param firstName firstName
    * @generated
    */
    public Customer setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
        return this;
    }
    /**
    * Obtém lastName
    * return lastName
    * @generated
    */
    public java.lang.String getLastName() {
        return this.lastName;
    }

    /**
    * Define lastName
    * @param lastName lastName
    * @generated
    */
    public Customer setLastName(java.lang.String lastName) {
        this.lastName = lastName;
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
    public Customer setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    /**
    * Obtém storeId
    * return storeId
    * @generated
    */
    public java.lang.Short getStoreId() {
        return this.storeId;
    }

    /**
    * Define storeId
    * @param storeId storeId
    * @generated
    */
    public Customer setStoreId(java.lang.Short storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Customer object = (Customer)obj;
        if (customerId != null ? !customerId.equals(object.customerId) : object.customerId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((customerId == null) ? 0 : customerId.hashCode());
        return result;
    }

}
