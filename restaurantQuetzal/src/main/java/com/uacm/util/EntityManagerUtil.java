package com.uacm.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	
	private static final String PERSISTENCE_UNIT_NAME = "restaurantQuetzal";
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	
	public static void close(Connection conn) {
		
		try {
			if(conn != null && conn.isClosed()) {
				conn.close();
			}
		}catch(SQLException sqlEx) {
			
		}catch(Exception e) {
			
		}finally {
			conn = null;
		}		
	}
	
	
	public static void close(EntityManager em) {
		
		if(em == null) {
			return;
		}
		
		if(em.isOpen()) {
			em.close();
		}
		
		em = null;
		return;
	}
	

}
