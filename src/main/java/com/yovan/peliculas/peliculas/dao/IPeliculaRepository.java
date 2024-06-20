package com.yovan.peliculas.peliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.yovan.peliculas.peliculas.entities.Pelicula;

public interface IPeliculaRepository extends CrudRepository<Pelicula, Long> {

}
