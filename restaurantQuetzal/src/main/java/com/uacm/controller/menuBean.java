package com.uacm.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;

import com.uacm.dao.menuDAO;
import com.uacm.model.MenuItem;

@Named
@ViewScoped
public class menuBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	private List<MenuItem> listaplatillos;
    private MenuItem platillo;
    private menuDAO menuDao;


	public menuBean() {
    	listaplatillos = new ArrayList<MenuItem>();
		menuDao = new menuDAO();
		
	}
	public void init() {
    	listaplatillos = menuDao.buscarTodos();
    	platillo = new MenuItem();
    	
    	
    }
	public List<MenuItem> getListaplatillos() {
		return listaplatillos;
	}


	public void setListaplatillos(List<MenuItem> listaplatillos) {
		this.listaplatillos = listaplatillos;
	}


	public MenuItem getPlatillo() {
		return platillo;
	}


	public void setPlatillo(MenuItem platillo) {
		this.platillo = platillo;
	}

    

    
    
}