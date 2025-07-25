
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
* Classe que representa a tabela rental
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"rental\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Rental")
@CronappTable(role=CronappTableRole.AUTO)
public class Rental implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Rental Id")
    @Column(name = "rental_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer rentalId;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false, referencedColumnName = "customer_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "rental_customer_id_fkey", foreignKeyDefinition = "FOREIGN KEY (customer_id) REFERENCES CUSTOMER (customer_id)"))
        
        private Customer customer;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="inventory_id", nullable = false, referencedColumnName = "inventory_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "rental_inventory_id_fkey", foreignKeyDefinition = "FOREIGN KEY (inventory_id) REFERENCES INVENTORY (inventory_id)"))
        
        private Inventory inventory;


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
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Rental Date")
    @Column(name = "rental_date", nullable = false, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date rentalDate;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Return Date")
    @Column(name = "return_date", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date returnDate;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="staff_id", nullable = false, referencedColumnName = "staff_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "rental_staff_id_key", foreignKeyDefinition = "FOREIGN KEY (staff_id) REFERENCES STAFF (staff_id)"))
        
        private Staff staff;


    /**
    * Construtor
    * @generated
    */
    public Rental(){
    }

    /**
    * Obtém rentalId
    * return rentalId
    * @generated
    */
    public java.lang.Integer getRentalId() {
        return this.rentalId;
    }

    /**
    * Define rentalId
    * @param rentalId rentalId
    * @generated
    */
    public Rental setRentalId(java.lang.Integer rentalId) {
        this.rentalId = rentalId;
        return this;
    }
    /**
    * Obtém customer
    * return customer
    * @generated
    */
    public Customer getCustomer() {
        return this.customer;
    }

    /**
    * Define customer
    * @param customer customer
    * @generated
    */
    public Rental setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }
    /**
    * Obtém inventory
    * return inventory
    * @generated
    */
    public Inventory getInventory() {
        return this.inventory;
    }

    /**
    * Define inventory
    * @param inventory inventory
    * @generated
    */
    public Rental setInventory(Inventory inventory) {
        this.inventory = inventory;
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
    public Rental setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    /**
    * Obtém rentalDate
    * return rentalDate
    * @generated
    */
    public java.util.Date getRentalDate() {
        return this.rentalDate;
    }

    /**
    * Define rentalDate
    * @param rentalDate rentalDate
    * @generated
    */
    public Rental setRentalDate(java.util.Date rentalDate) {
        this.rentalDate = rentalDate;
        return this;
    }
    /**
    * Obtém returnDate
    * return returnDate
    * @generated
    */
    public java.util.Date getReturnDate() {
        return this.returnDate;
    }

    /**
    * Define returnDate
    * @param returnDate returnDate
    * @generated
    */
    public Rental setReturnDate(java.util.Date returnDate) {
        this.returnDate = returnDate;
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
    public Rental setStaff(Staff staff) {
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
Rental object = (Rental)obj;
        if (rentalId != null ? !rentalId.equals(object.rentalId) : object.rentalId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((rentalId == null) ? 0 : rentalId.hashCode());
        return result;
    }

}
