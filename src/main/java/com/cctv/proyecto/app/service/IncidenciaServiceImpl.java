package com.cctv.proyecto.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cctv.proyecto.app.dao.IncidenciaDAO;
import com.cctv.proyecto.app.entity.Incidencia;

@Service
public class IncidenciaServiceImpl implements IncidenciaService {

	@Autowired
	private IncidenciaDAO incidenciaDAO;
	
	
	@Override
	public List<Incidencia> FindAll() {
		// TODO Auto-generated method stub
		return (List<Incidencia>) incidenciaDAO.findAll();
	}

	@Override
	public void save(Incidencia incidencia) {
		incidenciaDAO.save(incidencia);
		
	}

	@Override
	public Incidencia editar(int id) {
		// TODO Auto-generated method stub
		return incidenciaDAO.findById(id).orElse(null);
	}

	@Override
	public void Eliminar(int id) {
		 incidenciaDAO.deleteById(id);
		
	}


}
