package com.yovan.peliculas.peliculas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.yovan.peliculas.peliculas.entities.Pelicula;
import com.yovan.peliculas.peliculas.services.IGeneroService;
import com.yovan.peliculas.peliculas.services.IPeliculaService;

@Controller
public class PeliculasController {

  private IPeliculaService service;
  private IGeneroService generoService;

  public PeliculasController(IPeliculaService service, IGeneroService generoService) {
    this.service = service;
    this.generoService = generoService;
  }

  @GetMapping("/pelicula")
  public String crear(Model model) {
    Pelicula pelicula = new Pelicula();
    model.addAttribute("pelicula", pelicula);
    model.addAttribute("generos", generoService.findAll());
    model.addAttribute("titulo", "Nueva Pelicula");
    return "pelicula";
  }

  @GetMapping("/pelicula/{id}")
  public String editar(@PathVariable(name = "id") Long id, Model model) {
    Pelicula pelicula = new Pelicula();
    model.addAttribute("pelicula", pelicula);
    model.addAttribute("generos", generoService.findAll());
    model.addAttribute("titulo", "Nueva Pelicula");
    return "pelicula";
  }

  @PostMapping("/pelicula")
  public String guardar(Pelicula pelicula) {
    service.save(pelicula);
    return "redirect:home";
  }

  @GetMapping({ "/", "/home", "/index" })
  public String home() {
    return "home";

  }

}