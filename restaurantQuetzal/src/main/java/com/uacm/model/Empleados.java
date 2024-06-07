package com.uacm.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Empleados")

public class Empleados {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	Integer idEmpleado;

	@Column(name = "nombre")
	String Nombre;

	@Column(name = "apellido_paterno")
	String apellidoPaterno;

	@Column(name = "apellido_materno")
	String apellidoMaterno;

	@Column(name = "rfc")
	String RFC;

	@Column(name = "curp")
	String CURP;

	@Column(name = "correo")
	String correo;

	@Column(name = "num_telefonico")
	String numTelefonico;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 10)
	@Column(name = "num_empleado")
	private String numEmpleado;

	@Basic(optional = false)
	@Column(name = "activo")
	private short activo;

	@JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
	@ManyToOne(optional = false)
	private Perfil idPerfil;

	@JoinColumn(name = "id_puesto", referencedColumnName = "id_puesto")
	@ManyToOne(optional = false)
	private Puesto idPuesto;
	
	 @Column(name = "sueldo_diario")
	    private Float sueldoDiario;
	 
	    @Column(name = "fecha_ingreso")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date fechaIngreso;
	  
	    @Column(name = "fecha_nacimiento")
	    @Temporal(TemporalType.DATE)
	    private Date fechaNacimiento;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public String getCURP() {
		return CURP;
	}

	public void setCURP(String cURP) {
		CURP = cURP;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNumTelefonico() {
		return numTelefonico;
	}

	public void setNumTelefonico(String numTelefonico) {
		this.numTelefonico = numTelefonico;
	}

	public short getActivo() {
		return activo;
	}

	public void setActivo(short activo) {
		this.activo = activo;
	}

	public Perfil getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Perfil idPerfil) {
		this.idPerfil = idPerfil;
	}

	public Puesto getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(Puesto idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public Float getSueldoDiario() {
		return sueldoDiario;
	}

	public void setSueldoDiario(Float sueldoDiario) {
		this.sueldoDiario = sueldoDiario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
