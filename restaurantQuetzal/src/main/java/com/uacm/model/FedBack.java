package com.uacm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FedBack_cliente")
public class FedBack {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Fedback")
	Integer idFedbackCliente;
	 
	@Column(name = "nombre_cliente")
	String nombreCliente;
	
	@Column(name = "comentario_cliente")
	String comentarioCliente;
	
	@Column(name = "puntuacion_cliente")
	Number puntuacionCliente;

	public Integer getIdFedbackCliente() {
		return idFedbackCliente;
	}

	public void setIdFedbackCliente(Integer idFedbackCliente) {
		this.idFedbackCliente = idFedbackCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getComentarioCliente() {
		return comentarioCliente;
	}

	public void setComentarioCliente(String comentarioCliente) {
		this.comentarioCliente = comentarioCliente;
	}

	public Number getPuntuacionCliente() {
		return puntuacionCliente;
	}

	public void setPuntuacionCliente(Number puntuacionCliente) {
		this.puntuacionCliente = puntuacionCliente;
	}



	
	
}
