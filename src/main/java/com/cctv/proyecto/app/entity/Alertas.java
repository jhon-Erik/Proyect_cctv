package com.cctv.proyecto.app.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="alertas")
public class Alertas  implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
 	private int alert_id ;
	private String tipo_alert;
	

	@OneToMany(mappedBy = "alertas",fetch =  FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Incidencia> incidencia;
	
	
	
	
	public List<Incidencia> getIncidencia() {
		return incidencia;
	}


	public void setIncidencia(List<Incidencia> incidencia) {
		this.incidencia = incidencia;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Alertas(int alert_id, String tipo_alert) {

		this.alert_id = alert_id;
		this.tipo_alert = tipo_alert;
	}


	public Alertas() {
		
	}


	public int getAlert_id() {
		return alert_id;
	}


	public void setAlert_id(int alert_id) {
		this.alert_id = alert_id;
	}


	public String getTipo_alert() {
		return tipo_alert;
	}


	public void setTipo_alert(String tipo_alert) {
		this.tipo_alert = tipo_alert;
	}
	
	
	
	
	
}
