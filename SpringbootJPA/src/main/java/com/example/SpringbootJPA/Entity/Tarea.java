package com.example.SpringbootJPA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tarea {
  // Atributos
  @Id
  @GeneratedValue
  private Long id;
  private String descripcion;
  private boolean completada;
  // Constructores
  public Tarea() {
  }
  public Tarea(String descripcion, boolean completada) {
    this.descripcion = descripcion;
    this.completada = completada;
  }
  // Getters y setters
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  public boolean isCompletada() {
    return completada;
  }
  public void setCompletada(boolean completada) {
    this.completada = completada;
  }

}
