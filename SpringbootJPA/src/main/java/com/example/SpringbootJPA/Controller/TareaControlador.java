package com.example.SpringbootJPA.Controller;

import com.example.SpringbootJPA.Entity.Tarea;
import org.springframework.web.bind.annotation.*;
import com.example.SpringbootJPA.Repository.TareaRepositorio;

import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TareaControlador {
  private final TareaRepositorio tareaRepositorio;
  // Inicializando un contructor que crea una instancia de tareaRepositorio
  public TareaControlador(TareaRepositorio tareaRepositorio){
    this.tareaRepositorio = tareaRepositorio;
  }

  // Obtener todas las tareas
  @GetMapping
  public List<Tarea> obtenerTodasLasTareas(){
    return tareaRepositorio.findAll();
  }
  @PostMapping
  public Tarea crearTarea(@RequestBody Tarea tarea){
    return tareaRepositorio.save(tarea);
  }
  @PutMapping("/{id}")
  public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea tarea){
    Tarea tareaActual = tareaRepositorio.findById(id).get();
    tareaActual.setCompletada(tarea.isCompletada());
    tareaActual.setDescripcion(tarea.getDescripcion());
    return tareaRepositorio.save(tareaActual);
  }
  @DeleteMapping("/{id}")
  public void eliminarTarea(@PathVariable Long id){
    tareaRepositorio.deleteById(id);
  }

}
