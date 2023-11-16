package com.cctv.proyecto.app.service;

import java.util.List;

import com.cctv.proyecto.app.entity.Sede;

public interface SedeService {
	
	
	public List<Sede>listar();

	public Sede ObtenerSede(Integer idSeed);
	public Sede insertarSede(Sede sede);
	public Sede actualizarSede(Sede sede);
	public Sede eliminarSede(Integer idSede);


}
