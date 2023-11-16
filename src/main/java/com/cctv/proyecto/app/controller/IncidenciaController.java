package com.cctv.proyecto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cctv.proyecto.app.entity.ErrorEntity;
import com.cctv.proyecto.app.entity.Incidencia;
import com.cctv.proyecto.app.service.IncidenciaService;

@RestController
@RequestMapping("/api")
public class IncidenciaController {
	
	@Autowired
	private  IncidenciaService incidenciaService;

	//METODO LISTAR
    @GetMapping("/incidencias/listar") 
	public List<Incidencia>listar(Model model) {
		model.addAttribute("titulo","listado de incidencias");
		model.addAttribute("listaIncidencias", incidenciaService.listar());
		return incidenciaService.listar();
	}

    
    
    @GetMapping("/incidencias/{id}")
    public ResponseEntity obtenerIncidencia(@PathVariable(value="id")Integer id){
    	try {
    		return ResponseEntity.status(HttpStatus.OK).body(incidenciaService.ObtenerIncidencia(id));
			
		} catch (Exception ex) {
			ErrorEntity error =  new ErrorEntity(HttpStatus.NOT_FOUND.toString(),"incidencia no encontrada", ex.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
			
		} 
    }
    
    
  
    
    @PostMapping("/incidencias")
    @ResponseStatus(value = HttpStatus.CREATED, reason = "se creo correctamente")
    @ResponseBody
    public ResponseEntity<Incidencia>insertarIncidencia(@RequestBody Incidencia incidencia){
    	incidencia =  incidenciaService.InsertarIncidencia(incidencia);
    	if(incidencia != null) {
    		return new ResponseEntity<>(incidencia,HttpStatus.CREATED);
    	}else {
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
    }
    
    
    @PutMapping("/incidencias/{id}")
    @ResponseStatus(value = HttpStatus.ACCEPTED, reason = "se actulizó correctamente")
    @ResponseBody
    public ResponseEntity<Incidencia>ActualizarIncidencia(@RequestBody Incidencia incidencia, @PathVariable(value="id")Integer id){
    	incidencia =  incidenciaService.ActualizarIncidencia(incidencia);
    	Incidencia incid  =  incidenciaService.ObtenerIncidencia(id);
    	if(incidencia != null) {
    		incidenciaService.ActualizarIncidencia(incid);
    		return new ResponseEntity<>(incid,HttpStatus.ACCEPTED);
    	}else {
    		return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    	
    }
    
    
    
    
    
    @DeleteMapping("/incidencias/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Incidencia EliminarIncidencia(@PathVariable(value="id")Integer id) {
    	return incidenciaService.EliminarIncidencia(id);
    }
}
