package com.yovan.peliculas.peliculas.services;

import java.util.List;

import com.yovan.peliculas.peliculas.entities.Pelicula;

public interface IPeliculaService {

  public void save(Pelicula pelicula);

  public Pelicula findByID(Long id);

  public void delete(Long Id);

  public List<Pelicula> findAll();
}
