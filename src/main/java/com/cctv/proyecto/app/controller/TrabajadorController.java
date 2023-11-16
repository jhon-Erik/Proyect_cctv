package com.cctv.proyecto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
import com.cctv.proyecto.app.entity.Trabajador;
import com.cctv.proyecto.app.service.TrabajadorService;


@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	
	@Autowired
	private TrabajadorService trabajadorService;

	@GetMapping("/trabajadores/listar")
	   public List<Trabajador>listar(){
		   
		   return trabajadorService.listar();
	   }
	
	@GetMapping("/trabajadores/{id}")
	public ResponseEntity obtenerTrabajador(@PathVariable (value="id") Integer id) {
		
		try {
			
			 return ResponseEntity.status(HttpStatus.OK).body(trabajadorService.obtenerTrabajador(id));
		}catch(Exception ex){
			ErrorEntity error =  new ErrorEntity (HttpStatus.NOT_FOUND.toString(),"trabajdor no encontrado", ex.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
				
		}
		
	}
	
	
	@PostMapping("/trabajadores")
	@ResponseStatus(value=HttpStatus.CREATED, reason="se creo correctamente")
	@ResponseBody
	public ResponseEntity<Trabajador>insertarTrabajador(@RequestBody Trabajador trabajador){
		trabajador = trabajadorService.insertarTrabajador(trabajador);
		if(trabajador != null) {
			 return new ResponseEntity<>(trabajador,HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	@PutMapping("/trabajadores/{id}")
	@ResponseStatus(value=HttpStatus.ACCEPTED, reason="se actualizo correctamente")
	@ResponseBody
	public ResponseEntity<Trabajador>actualizarTrabajador(@RequestBody Trabajador trabajador,@PathVariable(value="id")Integer id){
	   trabajador = trabajadorService.actualizarTrabajador(trabajador);
	   Trabajador trabaj =  trabajadorService.obtenerTrabajador(id);
	   if(trabajador !=null) {
		   trabajadorService.actualizarTrabajador(trabaj);
		   return new ResponseEntity<>(trabaj,HttpStatus.ACCEPTED);
	   }else {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	   }
	}
	
	
	@DeleteMapping("/trabajadores/{id}")
	@ResponseStatus(value=HttpStatus.NO_CONTENT, reason="se elimino correctamente")
	public Trabajador eliminarTrabajador(@PathVariable(value="id")Integer id) {
		return trabajadorService.eliminarTrabajador(id);
	}
	
	
	
}
