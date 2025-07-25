
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
* Classe que representa a tabela city
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"city\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.City")
@CronappTable(role=CronappTableRole.AUTO)
public class City implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="City Id")
    @Column(name = "city_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer cityId;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="City")
    @Column(name = "city", nullable = false, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String city;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="country_id", nullable = false, referencedColumnName = "country_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "fk_city", foreignKeyDefinition = "FOREIGN KEY (country_id) REFERENCES COUNTRY (country_id)"))
        
        private Country country;


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
    public City(){
    }

    /**
    * Obtém cityId
    * return cityId
    * @generated
    */
    public java.lang.Integer getCityId() {
        return this.cityId;
    }

    /**
    * Define cityId
    * @param cityId cityId
    * @generated
    */
    public City setCityId(java.lang.Integer cityId) {
        this.cityId = cityId;
        return this;
    }
    /**
    * Obtém city
    * return city
    * @generated
    */
    public java.lang.String getCity() {
        return this.city;
    }

    /**
    * Define city
    * @param city city
    * @generated
    */
    public City setCity(java.lang.String city) {
        this.city = city;
        return this;
    }
    /**
    * Obtém country
    * return country
    * @generated
    */
    public Country getCountry() {
        return this.country;
    }

    /**
    * Define country
    * @param country country
    * @generated
    */
    public City setCountry(Country country) {
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
    public City setLastUpdate(java.util.Date lastUpdate) {
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
City object = (City)obj;
        if (cityId != null ? !cityId.equals(object.cityId) : object.cityId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((cityId == null) ? 0 : cityId.hashCode());
        return result;
    }

}
