package com.cctv.proyecto.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cctv.proyecto.app.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer> {
	
      
	public Usuario FindByUsername(String username);
}
