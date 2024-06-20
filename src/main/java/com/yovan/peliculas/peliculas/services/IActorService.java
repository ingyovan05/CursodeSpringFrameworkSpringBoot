package com.yovan.peliculas.peliculas.services;

import java.util.List;

import com.yovan.peliculas.peliculas.entities.Actor;

public interface IActorService {

  public List<Actor> findAll();

  public List<Actor> findAllById(List<Long> ids);

}
