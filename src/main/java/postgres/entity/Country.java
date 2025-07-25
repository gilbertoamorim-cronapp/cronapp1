
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
* Classe que representa a tabela country
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"country\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Country")
@CronappTable(role=CronappTableRole.AUTO)
public class Country implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Country Id")
    @Column(name = "country_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer countryId;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Country")
    @Column(name = "country", nullable = false, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String country;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Last Update")
    @Column(name = "last_update", nullable = false, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date lastUpdate;


    /**
    * Construtor
    * @generated
    */
    public Country(){
    }

    /**
    * Obtém countryId
    * return countryId
    * @generated
    */
    public java.lang.Integer getCountryId() {
        return this.countryId;
    }

    /**
    * Define countryId
    * @param countryId countryId
    * @generated
    */
    public Country setCountryId(java.lang.Integer countryId) {
        this.countryId = countryId;
        return this;
    }
    /**
    * Obtém country
    * return country
    * @generated
    */
    public java.lang.String getCountry() {
        return this.country;
    }

    /**
    * Define country
    * @param country country
    * @generated
    */
    public Country setCountry(java.lang.String country) {
        this.country = country;
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
    public Country setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Country object = (Country)obj;
        if (countryId != null ? !countryId.equals(object.countryId) : object.countryId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((countryId == null) ? 0 : countryId.hashCode());
        return result;
    }

}
