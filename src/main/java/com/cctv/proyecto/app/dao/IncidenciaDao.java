package com.cctv.proyecto.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cctv.proyecto.app.entity.Incidencia;

public interface IncidenciaDao extends JpaRepository<Incidencia, Integer> {

}
