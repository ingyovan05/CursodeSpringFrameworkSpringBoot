package com.yovan.peliculas.peliculas.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "peliculas")
public class Pelicula implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;
  private String nombre;
  @Column(name = "fecha_estreno")
  @Temporal(TemporalType.DATE)
  private Date fechaEstreno;
  private Genero genero;
  // private List<Actor> protagonistas;

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

  public Date getFechaEstreno() {
    return fechaEstreno;
  }

  public void setFechaEstreno(Date fechaEstreno) {
    this.fechaEstreno = fechaEstreno;
  }

  public Genero getGenero() {
    return genero;
  }

  public void setGenero(Genero genero) {
    this.genero = genero;
  }

  // public List<Actor> getProtagonistas() {
  //   return protagonistas;
  // }

  // public void setProtagonistas(List<Actor> protagonistas) {
  //   this.protagonistas = protagonistas;
  // }

}
