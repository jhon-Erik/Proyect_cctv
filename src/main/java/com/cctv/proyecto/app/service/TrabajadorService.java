package com.cctv.proyecto.app.service;

import java.util.List;

import com.cctv.proyecto.app.entity.Trabajador;

public interface TrabajadorService {
	
	public List<Trabajador>listar();
	
	public Trabajador obtenerTrabajador(Integer id);
	public Trabajador insertarTrabajador(Trabajador trabajador);
	public Trabajador actualizarTrabajador(Trabajador trabajador);
	public Trabajador eliminarTrabajador(Integer id);
	

}
