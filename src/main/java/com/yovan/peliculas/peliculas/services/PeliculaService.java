package com.yovan.peliculas.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yovan.peliculas.peliculas.dao.IPeliculaRepository;
import com.yovan.peliculas.peliculas.entities.Pelicula;

@Service
public class PeliculaService implements IPeliculaService {

  @Autowired
  private IPeliculaRepository peliculaRepository;

  @Override
  public void save(Pelicula pelicula) {
    peliculaRepository.save(pelicula);
  }

  @Override
  public Pelicula findByID(Long id) {
    return peliculaRepository.findById(id).orElse(null);
  }

  @Override
  public void delete(Long Id) {
    peliculaRepository.deleteById(Id);
  }

  @Override
  public List<Pelicula> findAll() {
    return (List<Pelicula>) peliculaRepository.findAll();
  }

}
