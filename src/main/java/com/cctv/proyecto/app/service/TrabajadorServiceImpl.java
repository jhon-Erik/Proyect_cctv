package com.cctv.proyecto.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cctv.proyecto.app.dao.TrabajadorDao;
import com.cctv.proyecto.app.entity.Trabajador;

@Service
public class TrabajadorServiceImpl  implements TrabajadorService{
	
	@Autowired
	 private TrabajadorDao trabajadorDao;

	@Override
	public List<Trabajador> listar() {
		// TODO Auto-generated method stub
		return trabajadorDao.findAll();
	}

	@Override
	public Trabajador obtenerTrabajador(Integer id) {
		// TODO Auto-generated method stub
		return trabajadorDao.findById(id).get();
	}

	@Override
	public Trabajador insertarTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return trabajadorDao.save(trabajador);
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return trabajadorDao.save(trabajador);
	}

	@Override
	public Trabajador eliminarTrabajador(Integer id) {
		
		 Trabajador trabajador =  trabajadorDao.findById(id).orElse(null);
		
		if(trabajador != null) {
			 trabajadorDao.deleteById(id);
		}
		 
		return trabajador;
	}


}
