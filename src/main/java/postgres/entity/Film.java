
package postgres.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
    import cronapi.CronapiByteHeaderSignature;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela film
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"film\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Film")
@CronappTable(role=CronappTableRole.AUTO)
public class Film implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Film Id")
    @Column(name = "film_id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer filmId;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Description")
    @Column(name = "description", nullable = true, unique = false, length=2147483647, insertable=true, updatable=true)
        
        private java.lang.String description;


    /**
    * @generated
    */
    @CronappColumn(attributeType="FILE_DATABASE", label="Fulltext")
    @Column(name = "fulltext", nullable = false, unique = false, length=2147483647, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] fulltext;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="language_id", nullable = false, referencedColumnName = "language_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "film_language_id_fkey", foreignKeyDefinition = "FOREIGN KEY (language_id) REFERENCES LANGUAGE (language_id)"))
        
        private Language language;


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
    @CronappColumn(attributeType="SHORT", label="Length")
    @Column(name = "length", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short length;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Rating")
    @Column(name = "rating", nullable = true, unique = false, length=2147483647, insertable=true, updatable=true)
        
        private java.lang.String rating;


    /**
    * @generated
    */
    @CronappColumn(attributeType="FILE_DATABASE", label="Release Year")
    @Column(name = "release_year", nullable = true, unique = false, length=10, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] releaseYear;


    /**
    * @generated
    */
    @CronappColumn(attributeType="SHORT", label="Rental Duration")
    @Column(name = "rental_duration", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short rentalDuration;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Rental Rate")
    @Column(name = "rental_rate", nullable = false, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double rentalRate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Replacement Cost")
    @Column(name = "replacement_cost", nullable = false, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double replacementCost;


    /**
    * @generated
    */
    @CronappColumn(attributeType="FILE_DATABASE", label="Special Features")
    @Column(name = "special_features", nullable = true, unique = false, length=2147483647, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] specialFeatures;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Title")
    @Column(name = "title", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String title;


    /**
    * Construtor
    * @generated
    */
    public Film(){
    }

    /**
    * Obtém filmId
    * return filmId
    * @generated
    */
    public java.lang.Integer getFilmId() {
        return this.filmId;
    }

    /**
    * Define filmId
    * @param filmId filmId
    * @generated
    */
    public Film setFilmId(java.lang.Integer filmId) {
        this.filmId = filmId;
        return this;
    }
    /**
    * Obtém description
    * return description
    * @generated
    */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
    * Define description
    * @param description description
    * @generated
    */
    public Film setDescription(java.lang.String description) {
        this.description = description;
        return this;
    }
    /**
    * Obtém fulltext
    * return fulltext
    * @generated
    */
    public byte[] getFulltext() {
        return this.fulltext;
    }

    /**
    * Define fulltext
    * @param fulltext fulltext
    * @generated
    */
    public Film setFulltext(byte[] fulltext) {
        this.fulltext = fulltext;
        return this;
    }
    /**
    * Obtém language
    * return language
    * @generated
    */
    public Language getLanguage() {
        return this.language;
    }

    /**
    * Define language
    * @param language language
    * @generated
    */
    public Film setLanguage(Language language) {
        this.language = language;
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
    public Film setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    /**
    * Obtém length
    * return length
    * @generated
    */
    public java.lang.Short getLength() {
        return this.length;
    }

    /**
    * Define length
    * @param length length
    * @generated
    */
    public Film setLength(java.lang.Short length) {
        this.length = length;
        return this;
    }
    /**
    * Obtém rating
    * return rating
    * @generated
    */
    public java.lang.String getRating() {
        return this.rating;
    }

    /**
    * Define rating
    * @param rating rating
    * @generated
    */
    public Film setRating(java.lang.String rating) {
        this.rating = rating;
        return this;
    }
    /**
    * Obtém releaseYear
    * return releaseYear
    * @generated
    */
    public byte[] getReleaseYear() {
        return this.releaseYear;
    }

    /**
    * Define releaseYear
    * @param releaseYear releaseYear
    * @generated
    */
    public Film setReleaseYear(byte[] releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }
    /**
    * Obtém rentalDuration
    * return rentalDuration
    * @generated
    */
    public java.lang.Short getRentalDuration() {
        return this.rentalDuration;
    }

    /**
    * Define rentalDuration
    * @param rentalDuration rentalDuration
    * @generated
    */
    public Film setRentalDuration(java.lang.Short rentalDuration) {
        this.rentalDuration = rentalDuration;
        return this;
    }
    /**
    * Obtém rentalRate
    * return rentalRate
    * @generated
    */
    public java.lang.Double getRentalRate() {
        return this.rentalRate;
    }

    /**
    * Define rentalRate
    * @param rentalRate rentalRate
    * @generated
    */
    public Film setRentalRate(java.lang.Double rentalRate) {
        this.rentalRate = rentalRate;
        return this;
    }
    /**
    * Obtém replacementCost
    * return replacementCost
    * @generated
    */
    public java.lang.Double getReplacementCost() {
        return this.replacementCost;
    }

    /**
    * Define replacementCost
    * @param replacementCost replacementCost
    * @generated
    */
    public Film setReplacementCost(java.lang.Double replacementCost) {
        this.replacementCost = replacementCost;
        return this;
    }
    /**
    * Obtém specialFeatures
    * return specialFeatures
    * @generated
    */
    public byte[] getSpecialFeatures() {
        return this.specialFeatures;
    }

    /**
    * Define specialFeatures
    * @param specialFeatures specialFeatures
    * @generated
    */
    public Film setSpecialFeatures(byte[] specialFeatures) {
        this.specialFeatures = specialFeatures;
        return this;
    }
    /**
    * Obtém title
    * return title
    * @generated
    */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
    * Define title
    * @param title title
    * @generated
    */
    public Film setTitle(java.lang.String title) {
        this.title = title;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Film object = (Film)obj;
        if (filmId != null ? !filmId.equals(object.filmId) : object.filmId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((filmId == null) ? 0 : filmId.hashCode());
        return result;
    }

}
