package com.yovan.peliculas.peliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.yovan.peliculas.peliculas.entities.Actor;

public interface IActorRepository extends CrudRepository<Actor, Long> {

}
