
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
* Classe que representa a tabela actor
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"actor\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Actor")
@CronappTable(role=CronappTableRole.AUTO)
public class Actor implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Actor Id")
    @Column(name = "actor_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer actorId;


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
    * Construtor
    * @generated
    */
    public Actor(){
    }

    /**
    * Obtém actorId
    * return actorId
    * @generated
    */
    public java.lang.Integer getActorId() {
        return this.actorId;
    }

    /**
    * Define actorId
    * @param actorId actorId
    * @generated
    */
    public Actor setActorId(java.lang.Integer actorId) {
        this.actorId = actorId;
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
    public Actor setFirstName(java.lang.String firstName) {
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
    public Actor setLastName(java.lang.String lastName) {
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
    public Actor setLastUpdate(java.util.Date lastUpdate) {
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
Actor object = (Actor)obj;
        if (actorId != null ? !actorId.equals(object.actorId) : object.actorId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((actorId == null) ? 0 : actorId.hashCode());
        return result;
    }

}
