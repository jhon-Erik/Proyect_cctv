package com.cctv.proyecto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cctv.proyecto.app.entity.Incidencia;
import com.cctv.proyecto.app.service.IncidenciaService;

@RestController
@RequestMapping("incidencia")
public class IncidenciaController {
	
	@Autowired
	private  IncidenciaService incidenciaService;
	
	//METODO LISTAR
    @GetMapping("/listar") 
	public List<Incidencia>lsitar(Model model) {
		model.addAttribute("titulo","listado de incidencias");
		model.addAttribute("listaIncidencias", incidenciaService.listar());
		return incidenciaService.listar();
	}

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED, reason = "se creó correctamente")
    @ResponseBody
    public ResponseEntity<Incidencia>insertarIncidencia(@RequestBody Incidencia incidencia){
    	incidencia =  incidenciaService.InsertarIncidencia(incidencia);
    	if(incidencia != null) {
    		return new ResponseEntity<>(incidencia,HttpStatus.CREATED);
    	}else {
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
    }
}
