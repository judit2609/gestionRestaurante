package com.uacm.model;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.uacm.util.EntityManagerUtil;

public class MainSource  {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerUtil.getEntityManager();
		
		em.getTransaction().begin();
		Empleados empleado = new Empleados();
		FedBack fedback = new FedBack();
		MenuItem menu = new MenuItem();
		Mesas mesa = new Mesas();
		Perfil perfil = new Perfil();
		Puesto puesto = new Puesto();
		Reservacion reservacion = new Reservacion();
		Usuarios u = new Usuarios();
		

		
		em.persist(empleado);
		em.persist(fedback);
		em.persist(menu);
		em.persist(mesa);
		em.persist(perfil);
		em.persist(puesto);
		em.persist(reservacion);
		em.persist(u);
		
		em.getTransaction().commit();
		em.close();

	}

}
