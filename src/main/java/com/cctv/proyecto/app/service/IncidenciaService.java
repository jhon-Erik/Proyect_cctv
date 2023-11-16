package com.cctv.proyecto.app.service;

import java.util.List;


import com.cctv.proyecto.app.entity.Incidencia;

public interface IncidenciaService {

	
    public List<Incidencia> listar();
	public Incidencia ObtenerIncidencia(Integer id);
	public Incidencia InsertarIncidencia( Incidencia incidencia);
	public Incidencia  ActualizarIncidencia(Incidencia incidencia);
	public Incidencia EliminarIncidencia(Integer id);
	
}
