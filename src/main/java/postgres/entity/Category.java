
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
* Classe que representa a tabela category
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"category\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Category")
@CronappTable(role=CronappTableRole.AUTO)
public class Category implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Category Id")
    @Column(name = "category_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer categoryId;


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
    @Column(name = "name", nullable = false, unique = false, length=25, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * Construtor
    * @generated
    */
    public Category(){
    }

    /**
    * Obtém categoryId
    * return categoryId
    * @generated
    */
    public java.lang.Integer getCategoryId() {
        return this.categoryId;
    }

    /**
    * Define categoryId
    * @param categoryId categoryId
    * @generated
    */
    public Category setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
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
    public Category setLastUpdate(java.util.Date lastUpdate) {
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
    public Category setName(java.lang.String name) {
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
Category object = (Category)obj;
        if (categoryId != null ? !categoryId.equals(object.categoryId) : object.categoryId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((categoryId == null) ? 0 : categoryId.hashCode());
        return result;
    }

}
