
package com.cctv.proyecto.app.entity;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "incidencias")
public class Incidencia {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_incidencia")
	private Integer id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha_incidencia")
	private Date fechaIncidencia;
	
	@Column(name = "hora")
	private String hora;
	
	private Integer estado;
	
	@ManyToOne
	@JoinColumn(name = "id_sede")
	private Sede sede;
	
	@OneToOne
	@JoinColumn(name = "id_alerta")
	private Alerta alerta;

}
