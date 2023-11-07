package com.cctv.proyecto.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cctv.proyecto.app.dao.IncidenciaDao;

import com.cctv.proyecto.app.entity.Incidencia;

@Service
public class IncidenciaServiceImpl implements IncidenciaService {

	@Autowired
	private IncidenciaDao incidenciaDao ;
	
	

	@Override
	public List<Incidencia> listar() {
		
		return incidenciaDao.findAll();
	}


	@Override
	public Incidencia ObtenerIncidencia(Integer id) {
		// TODO Auto-generated method stub
		return incidenciaDao.findById(id).get();
	}





	@Override
	public Incidencia InsertarIncidencia(Incidencia incidencia) {
		// TODO Auto-generated method stub
		return incidenciaDao.save(incidencia);
	}





	@Override
	public Incidencia ActualizarIncidencia(Incidencia incidencia) {
		// TODO Auto-generated method stub
		return incidenciaDao.save(incidencia);
	}





	@Override
	public Incidencia EliminarIncidencia(Integer id) {
		// TODO Auto-generated method stub
		Incidencia incidencia  = incidenciaDao.findById(id).get();
		if(incidencia !=null) {
			incidencia.setEstado(0);
		}
		return incidenciaDao.save(incidencia);
	}



}
