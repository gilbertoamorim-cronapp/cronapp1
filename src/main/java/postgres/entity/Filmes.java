
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
* Classe que representa a tabela filmes
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"filmes\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Filmes")
@CronappTable(role=CronappTableRole.AUTO)
public class Filmes implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Ano Lancamento")
    @Column(name = "ano_lancamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer anoLancamento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Diretor")
    @Column(name = "diretor", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String diretor;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Duracao")
    @Column(name = "duracao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer duracao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Genero")
    @Column(name = "genero", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String genero;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Titulo")
    @Column(name = "titulo", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String titulo;


    /**
    * Construtor
    * @generated
    */
    public Filmes(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Filmes setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém anoLancamento
    * return anoLancamento
    * @generated
    */
    public java.lang.Integer getAnoLancamento() {
        return this.anoLancamento;
    }

    /**
    * Define anoLancamento
    * @param anoLancamento anoLancamento
    * @generated
    */
    public Filmes setAnoLancamento(java.lang.Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
        return this;
    }
    /**
    * Obtém diretor
    * return diretor
    * @generated
    */
    public java.lang.String getDiretor() {
        return this.diretor;
    }

    /**
    * Define diretor
    * @param diretor diretor
    * @generated
    */
    public Filmes setDiretor(java.lang.String diretor) {
        this.diretor = diretor;
        return this;
    }
    /**
    * Obtém duracao
    * return duracao
    * @generated
    */
    public java.lang.Integer getDuracao() {
        return this.duracao;
    }

    /**
    * Define duracao
    * @param duracao duracao
    * @generated
    */
    public Filmes setDuracao(java.lang.Integer duracao) {
        this.duracao = duracao;
        return this;
    }
    /**
    * Obtém genero
    * return genero
    * @generated
    */
    public java.lang.String getGenero() {
        return this.genero;
    }

    /**
    * Define genero
    * @param genero genero
    * @generated
    */
    public Filmes setGenero(java.lang.String genero) {
        this.genero = genero;
        return this;
    }
    /**
    * Obtém titulo
    * return titulo
    * @generated
    */
    public java.lang.String getTitulo() {
        return this.titulo;
    }

    /**
    * Define titulo
    * @param titulo titulo
    * @generated
    */
    public Filmes setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Filmes object = (Filmes)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
