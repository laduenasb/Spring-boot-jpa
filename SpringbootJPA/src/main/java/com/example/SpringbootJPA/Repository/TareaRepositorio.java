package com.example.SpringbootJPA.Repository;

import com.example.SpringbootJPA.Entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Creacion de la TareaRepositorio

// Tipo de entidad y el tipo de la clave primaria
@Repository
public interface TareaRepositorio extends JpaRepository<Tarea, Long> {

}
