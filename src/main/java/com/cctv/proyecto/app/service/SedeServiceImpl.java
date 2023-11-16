package com.cctv.proyecto.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cctv.proyecto.app.dao.SedeDao;
import com.cctv.proyecto.app.entity.Sede;

@Service
public class SedeServiceImpl implements SedeService {
	
	@Autowired
	public SedeDao sedeDao;

	@Override
	public List<Sede> listar() {
		// TODO Auto-generated method stub
		return sedeDao.findAll();
	}

	@Override
	public Sede ObtenerSede(Integer idSeed) {
		// TODO Auto-generated method stub
		return sedeDao.findById(idSeed).get();
	}

	@Override
	public Sede insertarSede(Sede sede) {
		// TODO Auto-generated method stub
		return sedeDao.save(sede);
	}

	@Override
	public Sede actualizarSede(Sede sede) {
		// TODO Auto-generated method stub
		return sedeDao.save(sede);
	}

	@Override
	public Sede eliminarSede(Integer idSede) {
		// TODO Auto-generated method stub
		Sede sede  =  sedeDao.findById(idSede).orElse(null);
		if(sede != null) {
			sedeDao.deleteById(idSede);
		}
		
		return sede;
	}

}
