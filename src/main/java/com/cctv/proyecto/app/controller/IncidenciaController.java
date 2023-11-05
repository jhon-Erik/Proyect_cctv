package com.cctv.proyecto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cctv.proyecto.app.entity.Incidente;
import com.cctv.proyecto.app.service.IncidenteService;

@RestController
@RequestMapping("incidencia")
public class IncidenciaController {
	
	@Autowired
	private  IncidenteService incidenteService;
	
	//METODO LISTAR
    @GetMapping("/listar") 
	public List<Incidente>lsitar(Model model) {
		model.addAttribute("titulo","listado de incidencias");
		model.addAttribute("listaIncidencias", incidenteService.listar());
		return incidenteService.listar();
	}

}
