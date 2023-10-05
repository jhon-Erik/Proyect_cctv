package com.cctv.proyecto.app.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="trabajadores")
public class Trabajadore  implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trabj_id;
	private String nombre;
	private String apellido;
	@Temporal(TemporalType.DATE)
	private Date fech_nac;
	 private String email;
	

	 
	 public Trabajadore(int trabj_id, String nombre, String apellido, Date fech_nac, String email) {
	
		this.trabj_id = trabj_id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fech_nac = fech_nac;
		this.email = email;
	}
	 
	 
	public Trabajadore() {
	
	}



	public int getTrabj_id() {
		return trabj_id;
	}
	public void setTrabj_id(int trabj_id) {
		this.trabj_id = trabj_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFech_nac() {
		return fech_nac;
	}
	public void setFech_nac(Date fech_nac) {
		this.fech_nac = fech_nac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	 
	 
	 
	
	

}
