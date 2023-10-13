package com.cctv.proyecto.app.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name="incidencias")
public class Incidencia implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int incid_id;
	private String descripcion;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Temporal(TemporalType.TIME)
	private String time;
	
    
	@JoinColumn(name = "sedes_id")
	@ManyToOne(fetch =  FetchType.LAZY,cascade = CascadeType.ALL)
	private Sedes sedes;
	
	@ManyToOne(fetch =  FetchType.LAZY,cascade = CascadeType.ALL)
	private Alertas alertas;
	
	
	
	
	
	public Sedes getSedes() {
		return sedes;
	}

	public void setSedes(Sedes sedes) {
		this.sedes = sedes;
	}

	public Alertas getAlertas() {
		return alertas;
	}

	public void setAlertas(Alertas alertas) {
		this.alertas = alertas;
	}

	public Incidencia(int incid_id, String descripcion, Date fecha, String time) {
	
		this.incid_id = incid_id;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.time = time;
		
	}
	
	public Incidencia() {
		
	}

	public int getIncid_id() {
		return incid_id;
	}
	public void setIncid_id(int incid_id) {
		this.incid_id = incid_id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	
}
