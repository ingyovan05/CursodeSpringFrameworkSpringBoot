package com.yovan.peliculas.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yovan.peliculas.peliculas.dao.IActorRepository;
import com.yovan.peliculas.peliculas.entities.Actor;

@Service
public class ActorService implements IActorService {

  @Autowired
  private IActorRepository actorRepository;

  @Override
  public List<Actor> findAll() {
    return (List<Actor>) actorRepository.findAll();
  }

  @Override
  public List<Actor> findAllById(List<Long> ids) {
    return (List<Actor>) actorRepository.findAllById(ids);
  }

}
