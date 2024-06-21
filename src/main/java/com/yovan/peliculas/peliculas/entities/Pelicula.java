package com.yovan.peliculas.peliculas.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "peliculas")
public class Pelicula implements  java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;

  @NotEmpty
  private String nombre;

  @Column(name = "fecha_estreno")
  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @NotNull(message = "El campo fecha de estreno no debe estar vacio")
  private java.util.Date fechaEstreno;

  @NotNull
  // @OneToOne
  private Genero genero;

  @ManyToMany
  private List<Actor> protagonistas;

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

  public List<Actor> getProtagonistas() {
    return protagonistas;
  }

  public void setProtagonistas(List<Actor> protagonistas) {
    this.protagonistas = protagonistas;
  }

}
