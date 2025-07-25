package postgres.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;


/**
* @generated
*
**/
public class FilmActorPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.Integer actor;

  /**
   * @generated
   */
  private java.lang.Integer film;

  /**
   * Construtor
   * @generated
   */
  public FilmActorPK(){
  }

  /**
   * Obtém actor
   * return actor
   * @generated
   */
  public java.lang.Integer getActor(){
    return this.actor;
  }

  /**
   * Define actor
   * @param actor actor
   * @generated
   */
  public FilmActorPK setActor(java.lang.Integer actor){
    this.actor = actor;
    return this;
  }
  /**
   * Obtém film
   * return film
   * @generated
   */
  public java.lang.Integer getFilm(){
    return this.film;
  }

  /**
   * Define film
   * @param film film
   * @generated
   */
  public FilmActorPK setFilm(java.lang.Integer film){
    this.film = film;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
FilmActorPK object = (FilmActorPK)obj;
    if (actor != null ? !actor.equals(object.actor) : object.actor != null) return false;
    if (film != null ? !film.equals(object.film) : object.film != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((actor == null) ? 0 : actor.hashCode());
    result = 31 * result + ((film == null) ? 0 : film.hashCode());
    return result;
  }

}
