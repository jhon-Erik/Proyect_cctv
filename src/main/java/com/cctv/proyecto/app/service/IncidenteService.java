package com.cctv.proyecto.app.service;

import java.util.List;


import com.cctv.proyecto.app.entity.Incidente;

public interface IncidenteService {

	
    public List<Incidente> listar();

	public void save(Incidente incidencia);
	
	public Incidente editar(Integer id);
	
	public void  Eliminar(Integer id);
	
}
