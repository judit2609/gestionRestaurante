package com.uacm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservacion_mesas")

public class Reservacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reservacion")
	Integer idReservacion;
	
	@JoinColumn(name = "num_mesa", referencedColumnName = "id_mesa")
	@ManyToOne
	Mesas numMesa;
	
	@Column(name = "fecha")
	Date fecha;
	
	@Column(name = "hora")
	Date hora;
	
	@Column(name = "nombre_responsable")
	String nombreResponsable;

	@Column(name = "folio")
	String folio;

	public Integer getIdReservacion() {
		return idReservacion;
	}

	public void setIdReservacion(Integer idReservacion) {
		this.idReservacion = idReservacion;
	}


	public Mesas getNumMesa() {
		return numMesa;
	}

	public void setNumMesa(Mesas numMesa) {
		this.numMesa = numMesa;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getNombreResponsable() {
		return nombreResponsable;
	}

	public void setNombreResponsable(String nombreResponsable) {
		this.nombreResponsable = nombreResponsable;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}





}
