package postgres.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;


/**
* @generated
*
**/
public class FilmCategoryPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.Integer category;

  /**
   * @generated
   */
  private java.lang.Integer film;

  /**
   * Construtor
   * @generated
   */
  public FilmCategoryPK(){
  }

  /**
   * Obtém category
   * return category
   * @generated
   */
  public java.lang.Integer getCategory(){
    return this.category;
  }

  /**
   * Define category
   * @param category category
   * @generated
   */
  public FilmCategoryPK setCategory(java.lang.Integer category){
    this.category = category;
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
  public FilmCategoryPK setFilm(java.lang.Integer film){
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
FilmCategoryPK object = (FilmCategoryPK)obj;
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
