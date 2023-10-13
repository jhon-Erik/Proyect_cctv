package com.cctv.proyecto.app.service;

import java.util.List;

import com.cctv.proyecto.app.entity.Incidencia;

public interface IncidenciaService {

	
	public List<Incidencia>FindAll();

	public void save(Incidencia incidencia);
	
	public Incidencia editar(int id);
	
	public void  Eliminar(int id);
	
}
