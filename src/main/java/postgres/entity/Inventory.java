
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
* Classe que representa a tabela inventory
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"inventory\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Inventory")
@CronappTable(role=CronappTableRole.AUTO)
public class Inventory implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Inventory Id")
    @Column(name = "inventory_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer inventoryId;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="film_id", nullable = false, referencedColumnName = "film_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "inventory_film_id_fkey", foreignKeyDefinition = "FOREIGN KEY (film_id) REFERENCES FILM (film_id)"))
        
        private Film film;


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
    @CronappColumn(attributeType="SHORT", label="Store Id")
    @Column(name = "store_id", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short storeId;


    /**
    * Construtor
    * @generated
    */
    public Inventory(){
    }

    /**
    * Obtém inventoryId
    * return inventoryId
    * @generated
    */
    public java.lang.Integer getInventoryId() {
        return this.inventoryId;
    }

    /**
    * Define inventoryId
    * @param inventoryId inventoryId
    * @generated
    */
    public Inventory setInventoryId(java.lang.Integer inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }
    /**
    * Obtém film
    * return film
    * @generated
    */
    public Film getFilm() {
        return this.film;
    }

    /**
    * Define film
    * @param film film
    * @generated
    */
    public Inventory setFilm(Film film) {
        this.film = film;
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
    public Inventory setLastUpdate(java.util.Date lastUpdate) {
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
    public Inventory setStoreId(java.lang.Short storeId) {
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
Inventory object = (Inventory)obj;
        if (inventoryId != null ? !inventoryId.equals(object.inventoryId) : object.inventoryId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((inventoryId == null) ? 0 : inventoryId.hashCode());
        return result;
    }

}
