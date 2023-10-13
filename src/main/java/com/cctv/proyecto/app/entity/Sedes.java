package com.cctv.proyecto.app.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="sedes")
public class Sedes  implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sed_id;
	private String nombre;
	
	
	@JoinColumn(name = "trabajadores_id")
	@ManyToOne(fetch =  FetchType.LAZY,cascade = CascadeType.ALL)
    private Trabajadores trabajadores;	
 

	@OneToMany(mappedBy = "sedes")
	private List<Incidencia> incidencia;
	
	
	
	
	
	public Trabajadores getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(Trabajadores trabajadores) {
		this.trabajadores = trabajadores;
	}

	public List<Incidencia> getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(List<Incidencia> incidencia) {
		this.incidencia = incidencia;
	}

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
