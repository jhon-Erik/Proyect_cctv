package com.cctv.proyecto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.cctv.proyecto.app.entity.Sede;
import com.cctv.proyecto.app.service.SedeService;

@RestController
@RequestMapping("/api")
public class SedeController {
	
	 
	
	@Autowired
	private SedeService sedeService;
	
	@GetMapping("/sedes/listar")
	public List<Sede> listar(){
		
		return sedeService.listar();
	}
	
	@GetMapping("/sedes/{idSede}")
	public ResponseEntity obtenerSede(@PathVariable (value="idSede") Integer idSede) {
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(sedeService.ObtenerSede(idSede));
			
		} catch (Exception ex) {
			ErrorEntity error =  new ErrorEntity (HttpStatus.NOT_FOUND.toString(),"sede no encontrado", ex.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		}
	}
	
	
	@PostMapping("/sedes")
	@ResponseStatus(value=HttpStatus.CREATED, reason="se creo correctamente")
	@ResponseBody
	public ResponseEntity<Sede>insertarSede(@RequestBody Sede sede){
		sede =sedeService.insertarSede(sede);
		
		if(sede !=null) {
			return new ResponseEntity<>(sede,HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	@PutMapping("/sedes/{idSede}")
	@ResponseStatus(value=HttpStatus.CREATED, reason="se actualizo correctamente")
	@ResponseBody
	public ResponseEntity<Sede>actualizarSede(@RequestBody Sede sede,@PathVariable(value="isSede")Integer idSede){
		sede =sedeService.insertarSede(sede);
		Sede sed =  sedeService.ObtenerSede(idSede);
		if(sede !=null) {
			sedeService.actualizarSede(sed);
			   return new ResponseEntity<>(sed,HttpStatus.ACCEPTED);
		}else {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@DeleteMapping("/sedes/{idSede}")
	@ResponseStatus(value=HttpStatus.NO_CONTENT, reason="se elimino correctamente")
	public Sede eliminarSede(@PathVariable(value="idSede")Integer idSede) {
		
		return sedeService.eliminarSede(idSede);
	}
	

}
