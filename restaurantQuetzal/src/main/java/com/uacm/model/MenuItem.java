package com.uacm.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@Table(name = "menuitem")
@NamedQueries ({ 
	@NamedQuery(name = "MenuItem.findByAll", query = "SELECT m FROM MenuItem m"),
	@NamedQuery(name = "MenuItem.finById", query = "SELECT m FROM MenuItem m WHERE  m.idMenu = :idmenu"),
	@NamedQuery(name = "MenuItem.findBynombre", query = "SELECT m FROM MenuItem m WHERE  m.nombrePlatillo = :nombrePlatillo"),
	@NamedQuery(name = "MenuItem.findByDescripcion", query = "SELECT m FROM MenuItem m WHERE m.descripcionPlatillo = :descripcion"),
	@NamedQuery(name = "MenuItem.findByPrecio", query = "SELECT m FROM MenuItem m WHERE m.precioMenu = :precio")})



public class MenuItem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_menu")
	Integer idMenu;
	
	@Column(name = "nombre")
	Integer nombrePlatillo;
	
	@Column(name = "descripcion")
	String descripcionPlatillo;
	
	@Column(name = "precio")
	BigDecimal precioMenu;

	
	

	public Integer getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public Integer getNombrePlatillo() {
		return nombrePlatillo;
	}

	public void setNombrePlatillo(Integer nombrePlatillo) {
		this.nombrePlatillo = nombrePlatillo;
	}

	public String getDescripcionPlatillo() {
		return descripcionPlatillo;
	}

	public void setDescripcionPlatillo(String descripcionPlatillo) {
		this.descripcionPlatillo = descripcionPlatillo;
	}

	public BigDecimal getPrecioMenu() {
		return precioMenu;
	}

	public void setPrecioMenu(BigDecimal precioMenu) {
		this.precioMenu = precioMenu;
	}
	
	
	


}
