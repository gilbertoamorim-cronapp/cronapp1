
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
* Classe que representa a tabela filmes_atores
* @generated
*/
@jakarta.persistence.Entity
@IdClass(FilmesAtoresPK.class)
@jakarta.persistence.Table(name = "\"filmes_atores\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.FilmesAtores")
@CronappTable(role=CronappTableRole.AUTO)
public class FilmesAtores implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="ator_id", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        private Atores atores;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="filme_id", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        private Filmes filmes;



    /**
    * Construtor
    * @generated
    */
    public FilmesAtores(){
    }

    /**
    * Obtém atores
    * return atores
    * @generated
    */
    public Atores getAtores() {
        return this.atores;
    }

    /**
    * Define atores
    * @param atores atores
    * @generated
    */
    public FilmesAtores setAtores(Atores atores) {
        this.atores = atores;
        return this;
    }
    /**
    * Obtém filmes
    * return filmes
    * @generated
    */
    public Filmes getFilmes() {
        return this.filmes;
    }

    /**
    * Define filmes
    * @param filmes filmes
    * @generated
    */
    public FilmesAtores setFilmes(Filmes filmes) {
        this.filmes = filmes;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
FilmesAtores object = (FilmesAtores)obj;
        if (atores != null ? !atores.equals(object.atores) : object.atores != null) return false;
        if (filmes != null ? !filmes.equals(object.filmes) : object.filmes != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((atores == null) ? 0 : atores.hashCode());
        result = 31 * result + ((filmes == null) ? 0 : filmes.hashCode());
        return result;
    }

}
