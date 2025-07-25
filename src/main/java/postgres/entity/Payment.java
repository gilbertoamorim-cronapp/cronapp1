
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
* Classe que representa a tabela payment
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"payment\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Payment")
@CronappTable(role=CronappTableRole.AUTO)
public class Payment implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Payment Id")
    @Column(name = "payment_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer paymentId;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Amount")
    @Column(name = "amount", nullable = false, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double amount;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false, referencedColumnName = "customer_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "payment_customer_id_fkey", foreignKeyDefinition = "FOREIGN KEY (customer_id) REFERENCES CUSTOMER (customer_id)"))
        
        private Customer customer;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Payment Date")
    @Column(name = "payment_date", nullable = false, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date paymentDate;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="rental_id", nullable = false, referencedColumnName = "rental_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "payment_rental_id_fkey", foreignKeyDefinition = "FOREIGN KEY (rental_id) REFERENCES RENTAL (rental_id)"))
        
        private Rental rental;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="staff_id", nullable = false, referencedColumnName = "staff_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "payment_staff_id_fkey", foreignKeyDefinition = "FOREIGN KEY (staff_id) REFERENCES STAFF (staff_id)"))
        
        private Staff staff;


    /**
    * Construtor
    * @generated
    */
    public Payment(){
    }

    /**
    * Obtém paymentId
    * return paymentId
    * @generated
    */
    public java.lang.Integer getPaymentId() {
        return this.paymentId;
    }

    /**
    * Define paymentId
    * @param paymentId paymentId
    * @generated
    */
    public Payment setPaymentId(java.lang.Integer paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    /**
    * Obtém amount
    * return amount
    * @generated
    */
    public java.lang.Double getAmount() {
        return this.amount;
    }

    /**
    * Define amount
    * @param amount amount
    * @generated
    */
    public Payment setAmount(java.lang.Double amount) {
        this.amount = amount;
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
    public Payment setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }
    /**
    * Obtém paymentDate
    * return paymentDate
    * @generated
    */
    public java.util.Date getPaymentDate() {
        return this.paymentDate;
    }

    /**
    * Define paymentDate
    * @param paymentDate paymentDate
    * @generated
    */
    public Payment setPaymentDate(java.util.Date paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
    /**
    * Obtém rental
    * return rental
    * @generated
    */
    public Rental getRental() {
        return this.rental;
    }

    /**
    * Define rental
    * @param rental rental
    * @generated
    */
    public Payment setRental(Rental rental) {
        this.rental = rental;
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
    public Payment setStaff(Staff staff) {
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
Payment object = (Payment)obj;
        if (paymentId != null ? !paymentId.equals(object.paymentId) : object.paymentId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((paymentId == null) ? 0 : paymentId.hashCode());
        return result;
    }

}
