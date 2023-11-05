package com.cctv.proyecto.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cctv.proyecto.app.dao.IncidenciaDao;

import com.cctv.proyecto.app.entity.Incidente;

@Service
public class IncidenteServiceImpl implements IncidenteService {

	@Autowired
	private IncidenciaDao incidenciaDao ;
	
	
	

	@Override
	public void save(Incidente incidencia) {
		incidenciaDao.save(incidencia);
		
	}

	@Override
	public Incidente editar(Integer id) {
		// TODO Auto-generated method stub
		return incidenciaDao.findById(id).orElse(null);
	}

	@Override
	public void Eliminar(Integer id) {
		incidenciaDao.deleteById(id);
		
	}

	@Override
	public List<Incidente> listar() {
		
		return incidenciaDao.findAll();
	}



}
