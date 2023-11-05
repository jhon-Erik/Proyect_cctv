package com.cctv.proyecto.app.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trabajadores")
public class Trabajador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_trabajador")
	private Integer idTrabajador;

	@Column(name = "nombre_trabajador")
	private String nombreTrabajador;

	@Column(name = "apellido_trabajador")
	private String apellidoTrabajador;

	@Column(name = "fecha_Nactrabajador")
	private Date fechaNacimientoTrabajador;

	
	@Column(name = "email_trabajador")
	private String emailTrabajador;

}
