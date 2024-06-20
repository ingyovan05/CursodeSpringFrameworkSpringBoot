package com.yovan.peliculas.peliculas.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actores")
public class Actor implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;
  private String nombre;
  @Column(name = "url_imagen")
  private String urlImagen;
  public Long getId() {
    return Id;
  }
  public void setId(Long id) {
    Id = id;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getUrlImagen() {
    return urlImagen;
  }
  public void setUrlImagen(String urlImagen) {
    this.urlImagen = urlImagen;
  }

  

}
