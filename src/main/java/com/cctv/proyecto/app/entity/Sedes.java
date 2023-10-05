package com.cctv.proyecto.app.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="sedes")
public class Sedes  implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sed_id;
	private String nombre;
	
	public Sedes(int sed_id, String nombre) {
	
		this.sed_id = sed_id;
		this.nombre = nombre;
	}

	public Sedes() {

	}

	public int getSed_id() {
		return sed_id;
	}

	public void setSed_id(int sed_id) {
		this.sed_id = sed_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	

	

}
