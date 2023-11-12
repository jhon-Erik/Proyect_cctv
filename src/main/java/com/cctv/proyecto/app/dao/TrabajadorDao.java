package com.cctv.proyecto.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cctv.proyecto.app.entity.Trabajador;

@Repository
public interface TrabajadorDao extends JpaRepository<Trabajador, Integer> {

}
