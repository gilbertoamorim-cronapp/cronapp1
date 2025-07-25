
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
* Classe que representa a tabela atores
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"atores\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Atores")
@CronappTable(role=CronappTableRole.AUTO)
public class Atores implements Serializable {
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
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Nascimento")
    @Column(name = "data_nascimento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataNascimento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nacionalidade")
    @Column(name = "nacionalidade", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String nacionalidade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nome")
    @Column(name = "nome", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * Construtor
    * @generated
    */
    public Atores(){
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
    public Atores setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém dataNascimento
    * return dataNascimento
    * @generated
    */
    public java.util.Date getDataNascimento() {
        return this.dataNascimento;
    }

    /**
    * Define dataNascimento
    * @param dataNascimento dataNascimento
    * @generated
    */
    public Atores setDataNascimento(java.util.Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }
    /**
    * Obtém nacionalidade
    * return nacionalidade
    * @generated
    */
    public java.lang.String getNacionalidade() {
        return this.nacionalidade;
    }

    /**
    * Define nacionalidade
    * @param nacionalidade nacionalidade
    * @generated
    */
    public Atores setNacionalidade(java.lang.String nacionalidade) {
        this.nacionalidade = nacionalidade;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Atores setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Atores object = (Atores)obj;
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
