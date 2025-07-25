
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
* Classe que representa a tabela store
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"store\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Store")
@CronappTable(role=CronappTableRole.AUTO)
public class Store implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Store Id")
    @Column(name = "store_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer storeId;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="address_id", nullable = false, referencedColumnName = "address_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "store_address_id_fkey", foreignKeyDefinition = "FOREIGN KEY (address_id) REFERENCES ADDRESS (address_id)"))
        
        private Address address;


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
    @ManyToOne
    @JoinColumn(name="manager_staff_id", nullable = false, referencedColumnName = "staff_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "store_manager_staff_id_fkey", foreignKeyDefinition = "FOREIGN KEY (manager_staff_id) REFERENCES STAFF (staff_id)"))
        
        private Staff staff;


    /**
    * Construtor
    * @generated
    */
    public Store(){
    }

    /**
    * Obtém storeId
    * return storeId
    * @generated
    */
    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    /**
    * Define storeId
    * @param storeId storeId
    * @generated
    */
    public Store setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
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
    public Store setAddress(Address address) {
        this.address = address;
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
    public Store setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    /**
    * Obtém staff
    * return staff
    * @generated
    */
    public Staff getStaff() {
        return this.staff;
    }

    /**
    * Define staff
    * @param staff staff
    * @generated
    */
    public Store setStaff(Staff staff) {
        this.staff = staff;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Store object = (Store)obj;
        if (storeId != null ? !storeId.equals(object.storeId) : object.storeId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((storeId == null) ? 0 : storeId.hashCode());
        return result;
    }

}
