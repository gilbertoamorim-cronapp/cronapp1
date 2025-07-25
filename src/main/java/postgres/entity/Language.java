
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
* Classe que representa a tabela language
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"language\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Language")
@CronappTable(role=CronappTableRole.AUTO)
public class Language implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Language Id")
    @Column(name = "language_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer languageId;


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
    @CronappColumn(attributeType="STRING", label="Name")
    @Column(name = "name", nullable = false, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * Construtor
    * @generated
    */
    public Language(){
    }

    /**
    * Obtém languageId
    * return languageId
    * @generated
    */
    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    /**
    * Define languageId
    * @param languageId languageId
    * @generated
    */
    public Language setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
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
    public Language setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Language setName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Language object = (Language)obj;
        if (languageId != null ? !languageId.equals(object.languageId) : object.languageId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((languageId == null) ? 0 : languageId.hashCode());
        return result;
    }

}
