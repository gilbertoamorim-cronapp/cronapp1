
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
* Classe que representa a tabela film_category
* @generated
*/
@jakarta.persistence.Entity
@IdClass(FilmCategoryPK.class)
@jakarta.persistence.Table(name = "\"film_category\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.FilmCategory")
@CronappTable(role=CronappTableRole.AUTO)
public class FilmCategory implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="category_id", nullable = false, referencedColumnName = "category_id", insertable=true, updatable=true)
        private Category category;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="film_id", nullable = false, referencedColumnName = "film_id", insertable=true, updatable=true)
        private Film film;



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
    public FilmCategory(){
    }

    /**
    * Obtém category
    * return category
    * @generated
    */
    public Category getCategory() {
        return this.category;
    }

    /**
    * Define category
    * @param category category
    * @generated
    */
    public FilmCategory setCategory(Category category) {
        this.category = category;
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
    public FilmCategory setFilm(Film film) {
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
    public FilmCategory setLastUpdate(java.util.Date lastUpdate) {
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
FilmCategory object = (FilmCategory)obj;
        if (category != null ? !category.equals(object.category) : object.category != null) return false;
        if (film != null ? !film.equals(object.film) : object.film != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((category == null) ? 0 : category.hashCode());
        result = 31 * result + ((film == null) ? 0 : film.hashCode());
        return result;
    }

}
