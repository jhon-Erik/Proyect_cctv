package com.cctv.proyecto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cctv.proyecto.app.entity.Trabajador;
import com.cctv.proyecto.app.service.TrabajadorService;


@RestController
@RequestMapping("trabajador")
public class TrabajadorController {
	
	
	@Autowired
	private TrabajadorService trabajadorService;

	@GetMapping("listar")
	   public List<Trabajador>listar(){
		   
		   return trabajadorService.listar();
	   }
	
}
