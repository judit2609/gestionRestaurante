package com.uacm.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.uacm.model.MenuItem;
import com.uacm.util.EntityManagerUtil;


public class menuDAO extends IBaseDAO<MenuItem, Integer> {
	//private static Logger log = LogManager.getLogger(MenuItem.class);

	@Override
	public MenuItem buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuItem> buscarTodos() {
		List<MenuItem> listamenu = null;
		EntityManager entity = null;

		try {
			entity = EntityManagerUtil.getEntityManager();
			listamenu = entity.createNamedQuery("MenuItem.findByAll", MenuItem.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			//log.error("Error al obtener informacion", e);
		} finally {
			EntityManagerUtil.close(entity);
		}
		return listamenu;
	}
	

	@Override
	public List<MenuItem> buscarPorCriterios(MenuItem e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String actualizar(MenuItem e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String guardar(MenuItem e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(MenuItem e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminarListado(List<MenuItem> listado) {
		// TODO Auto-generated method stub
		return null;
	}

}
