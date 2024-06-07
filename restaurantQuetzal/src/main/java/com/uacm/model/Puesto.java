package com.uacm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Puesto")
public class Puesto {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_puesto")
	Integer idPuesto;

	@Column(name = "descripcion")
	String descripcion;

	@Column(name = "activo")
    boolean activo;
	
	
	
	
	
	public Integer getIdPuesto() {
		return idPuesto;
	}





	public void setIdPuesto(Integer idPuesto) {
		this.idPuesto = idPuesto;
	}





	public String getDescripcion() {
		return descripcion;
	}





	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}





	public boolean isActivo() {
		return activo;
	}





	public void setActivo(boolean activo) {
		this.activo = activo;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
