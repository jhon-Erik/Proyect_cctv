package com.cctv.proyecto.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorEntity {
	
	private String status;
	private String message;
	private String error;

}
