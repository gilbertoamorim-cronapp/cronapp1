
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
* Classe que representa a tabela staff
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"staff\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Staff")
@CronappTable(role=CronappTableRole.AUTO)
public class Staff implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Staff Id")
    @Column(name = "staff_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer staffId;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Active")
    @Column(name = "active", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean active;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="address_id", nullable = false, referencedColumnName = "address_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "staff_address_id_fkey", foreignKeyDefinition = "FOREIGN KEY (address_id) REFERENCES ADDRESS (address_id)"))
        
        private Address address;


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
    @Column(name = "last_update", nullable = false, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date lastUpdate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Password")
    @Column(name = "password", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String password;


    /**
    * @generated
    */
    @CronappColumn(attributeType="IMAGE_DATABASE", label="Picture")
    @Column(name = "picture", nullable = true, unique = false, length=2147483647, insertable=true, updatable=true)
        
        private byte[] picture;


    /**
    * @generated
    */
    @CronappColumn(attributeType="SHORT", label="Store Id")
    @Column(name = "store_id", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short storeId;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Username")
    @Column(name = "username", nullable = false, unique = false, length=16, insertable=true, updatable=true)
        
        private java.lang.String username;


    /**
    * Construtor
    * @generated
    */
    public Staff(){
    }

    /**
    * Obtém staffId
    * return staffId
    * @generated
    */
    public java.lang.Integer getStaffId() {
        return this.staffId;
    }

    /**
    * Define staffId
    * @param staffId staffId
    * @generated
    */
    public Staff setStaffId(java.lang.Integer staffId) {
        this.staffId = staffId;
        return this;
    }
    /**
    * Obtém active
    * return active
    * @generated
    */
    public java.lang.Boolean getActive() {
        return this.active;
    }

    /**
    * Define active
    * @param active active
    * @generated
    */
    public Staff setActive(java.lang.Boolean active) {
        this.active = active;
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
    public Staff setAddress(Address address) {
        this.address = address;
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
    public Staff setEmail(java.lang.String email) {
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
    public Staff setFirstName(java.lang.String firstName) {
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
    public Staff setLastName(java.lang.String lastName) {
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
    public Staff setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    /**
    * Obtém password
    * return password
    * @generated
    */
    public java.lang.String getPassword() {
        return this.password;
    }

    /**
    * Define password
    * @param password password
    * @generated
    */
    public Staff setPassword(java.lang.String password) {
        this.password = password;
        return this;
    }
    /**
    * Obtém picture
    * return picture
    * @generated
    */
    public byte[] getPicture() {
        return this.picture;
    }

    /**
    * Define picture
    * @param picture picture
    * @generated
    */
    public Staff setPicture(byte[] picture) {
        this.picture = picture;
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
    public Staff setStoreId(java.lang.Short storeId) {
        this.storeId = storeId;
        return this;
    }
    /**
    * Obtém username
    * return username
    * @generated
    */
    public java.lang.String getUsername() {
        return this.username;
    }

    /**
    * Define username
    * @param username username
    * @generated
    */
    public Staff setUsername(java.lang.String username) {
        this.username = username;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Staff object = (Staff)obj;
        if (staffId != null ? !staffId.equals(object.staffId) : object.staffId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((staffId == null) ? 0 : staffId.hashCode());
        return result;
    }

}
