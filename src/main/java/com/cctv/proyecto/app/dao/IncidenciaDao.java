package com.cctv.proyecto.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cctv.proyecto.app.entity.Incidente;

public interface IncidenciaDao extends JpaRepository<Incidente, Integer> {

}
