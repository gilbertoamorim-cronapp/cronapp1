package postgres.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;


/**
* @generated
*
**/
public class FilmesAtoresPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.Integer atores;

  /**
   * @generated
   */
  private java.lang.Integer filmes;

  /**
   * Construtor
   * @generated
   */
  public FilmesAtoresPK(){
  }

  /**
   * Obtém atores
   * return atores
   * @generated
   */
  public java.lang.Integer getAtores(){
    return this.atores;
  }

  /**
   * Define atores
   * @param atores atores
   * @generated
   */
  public FilmesAtoresPK setAtores(java.lang.Integer atores){
    this.atores = atores;
    return this;
  }
  /**
   * Obtém filmes
   * return filmes
   * @generated
   */
  public java.lang.Integer getFilmes(){
    return this.filmes;
  }

  /**
   * Define filmes
   * @param filmes filmes
   * @generated
   */
  public FilmesAtoresPK setFilmes(java.lang.Integer filmes){
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
FilmesAtoresPK object = (FilmesAtoresPK)obj;
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
