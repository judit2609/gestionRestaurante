package com.uacm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mesas")
public class Mesas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mesa")
	Integer idMesa;
	
	@Column(name = "capacidad_mesa")
	String capacidadMesa;
	
	@Column(name = "status_mesa")
	String statusMesa;

	public Integer getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}

	public String getCapacidadMesa() {
		return capacidadMesa;
	}

	public void setCapacidadMesa(String capacidadMesa) {
		this.capacidadMesa = capacidadMesa;
	}

	public String getStatusMesa() {
		return statusMesa;
	}

	public void setStatusMesa(String statusMesa) {
		this.statusMesa = statusMesa;
	}
	
	
	
	
	
}
